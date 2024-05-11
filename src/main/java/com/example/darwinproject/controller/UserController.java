package com.example.darwinproject.controller;

import com.example.darwinproject.config.CreateRequest;
import com.example.darwinproject.config.GenericListResponse;
import com.example.darwinproject.config.GenericResponse;
import com.example.darwinproject.config.CreateResponse;
import com.example.darwinproject.domain.dto.DarwinUser;
import com.example.darwinproject.exception.UserNotFoundException;
import com.example.darwinproject.service.UserService;
import com.example.darwinproject.util.ValidUsername;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/darwin")
@Validated
public class UserController {
    UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public List<DarwinUser> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<GenericListResponse<List>> inquireUser(@PathVariable (value="id") long id) throws UserNotFoundException{
        GenericListResponse<List> response = service.findById(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable long id) {
        service.deleteById(id);
    }

    //a new comment
    @PostMapping("/user")
    public ResponseEntity<GenericResponse<Object>> createUser(@Valid @RequestBody CreateRequest request) throws SQLException {
        GenericResponse<Object> response = service.createUser(request);

        if(response.getReturnCode() == 200)
            return ResponseEntity.ok(response);
        else
            return new ResponseEntity<>(response, HttpStatus.I_AM_A_TEAPOT);
    }


}
