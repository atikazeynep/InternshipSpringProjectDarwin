package com.example.darwinproject;

import com.example.darwinproject.repository.StatusRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.darwinproject.domain.entities")
public class DarwinProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(DarwinProjectApplication.class, args);
    }

}
