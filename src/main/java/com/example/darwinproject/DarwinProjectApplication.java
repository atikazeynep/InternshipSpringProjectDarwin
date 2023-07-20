package com.example.darwinproject;

import com.example.darwinproject.entities.DarwinUser;
import com.example.darwinproject.jpa.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DarwinProjectApplication {
    //private static final Logger log = LoggerFactory.getLogger(DarwinProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DarwinProjectApplication.class,args);
    }

    /*
    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new DarwinUser("Atika", "1234", "atika", 321, 43, LocalDate.now(), LocalDate.now()));
            repository.save(new DarwinUser("Zeynep", "2345", "zeynep", 432, 54, LocalDate.now(), LocalDate.now()));
            repository.save(new DarwinUser("Evmez", "3456", "evmez", 543, 65, LocalDate.now(), LocalDate.now()));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (DarwinUser user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            DarwinUser darwinUser = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(darwinUser.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByUserName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByUserName("atika").forEach(atika -> {
                log.info(atika.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }*/


}
