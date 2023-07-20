package com.example.darwinproject.jpa;

import com.example.darwinproject.entities.DarwinUser;
import com.example.darwinproject.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    UserService service;
    public UserResource(UserService service, UserRepository repository){
        this.service = service;
    }
    @GetMapping("/darwin_user")
    public List<DarwinUser> retrieveAllUsers(){
        System.out.println("ALL USERS ARE SENT in JpaResource");
        return service.findAll();
    }

    @GetMapping("/darwin_user/{id}")
    public DarwinUser retrieveUser(@PathVariable int id){

        DarwinUser user = service.findOne(id);
        if(user == null){
            throw new UserNotFoundException("id: "+id);
        }

        return user;
    }

    @DeleteMapping("/darwin_user/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/darwin_user")
    public ResponseEntity<DarwinUser> createUser(@Valid @RequestBody DarwinUser user){
        DarwinUser savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getUserId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
