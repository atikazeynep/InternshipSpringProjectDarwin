package com.example.darwinproject.controller;

import com.example.darwinproject.entities.DarwinUser;
import com.example.darwinproject.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //@Autowired
    //private UserRepository repository;
    //@Autowired
    private UserRepository repository;

    public void run() {
        DarwinUser user = new DarwinUser();
        repository.save(user);
        System.out.println("\nHURRAY\n");
        //System.out.println(repository.findByName("Empty User"));
    }
}
