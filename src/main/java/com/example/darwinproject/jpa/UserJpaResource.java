package com.example.darwinproject.jpa;

import com.example.darwinproject.entities.DarwinUser;
import com.example.darwinproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import jakarta.validation.Valid;

@RestController
public class UserJpaResource {

    UserService service;
    UserRepository repository;
    public UserJpaResource(UserService service, UserRepository repository){
        this.service = service;
        this.repository=repository;
    }
    @GetMapping("/jpa/darwin_user")
    public List<DarwinUser> retrieveAllUsers(){
        System.out.println("ALL USERS ARE SENT in JpaResource");
        return repository.findAll();
    }

    @GetMapping("/jpa/darwin_user/{id}")
    public DarwinUser retrieveUser(@PathVariable int id){

        DarwinUser user = service.findOne(id);
        if(user == null){
            throw new UserNotFoundException("id: "+id);
        }

        return user;
    }

    @DeleteMapping("/jpa/darwin_user/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/jpa/darwin_user")
    public ResponseEntity<DarwinUser> createUser(@Valid @RequestBody DarwinUser user){
        DarwinUser savedUser = repository.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getUserId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
