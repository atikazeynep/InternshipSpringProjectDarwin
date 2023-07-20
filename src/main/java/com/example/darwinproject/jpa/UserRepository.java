package com.example.darwinproject.jpa;

import com.example.darwinproject.entities.DarwinUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<DarwinUser, Long> {
    //it might be CrudRepository instead of JpaRepository, Keep that in mind
    //DarwinUser findByName(String name);
    List<DarwinUser> findByUserName(String name);
    DarwinUser findById(long id);

    /*
    In a typical Java application, you might expect to write a class that implements CustomerRepository.
    However, that is what makes Spring Data JPA so powerful: You need not write an implementation of
    the repository interface. Spring Data JPA creates an implementation when you run the application.
     */
}
