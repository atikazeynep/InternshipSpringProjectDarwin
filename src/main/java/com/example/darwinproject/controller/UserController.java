package com.example.darwinproject.controller;

import com.example.darwinproject.domain.entities.DarwinUserEntity;
import com.example.darwinproject.exception.UserNotFoundException;
import com.example.darwinproject.repository.UserRepository;
import com.example.darwinproject.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    public UserController(UserRepository repository) {
        //this.service = service;
        this.service = service;
    }

    @GetMapping("/darwinUser")
    public List<DarwinUserEntity> retrieveAllUsers() {
        System.out.println("ALL USERS ARE SENT in JpaResource");
        return service.findAll();
    }

    @GetMapping("/darwinUser/{id}")
    public DarwinUserEntity retrieveUser(@PathVariable long id) {
        DarwinUserEntity user = service.findById(id);
        if (user == null) {
            throw new UserNotFoundException("id: " + id);
        }

        return user;
    }

    @DeleteMapping("/darwinUser/{id}")
    public void deleteUser(@PathVariable long id) {
        service.deleteById(id);
    }

    @PostMapping("/darwinUser")
    public ResponseEntity<DarwinUserEntity> createUser(@Valid @RequestBody DarwinUserEntity user) {
        System.out.println("A USER CREATED IN REPOSITORY");
        DarwinUserEntity savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getUserId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
