package com.example.darwinproject.repository;

import com.example.darwinproject.domain.entities.DarwinUserEntity;
import com.example.darwinproject.domain.entities.GnlTpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Predicate;

@Repository
public interface TypeRepository extends JpaRepository<GnlTpEntity, Long> {
    //it might be CrudRepository instead of JpaRepository, Keep that in mind
    //DarwinUserEntity findByName(String name);
    GnlTpEntity findByTypeId(long id);

    /*
    In a typical Java application, you might expect to write a class that implements CustomerRepository.
    However, that is what makes Spring Data JPA so powerful: You need not write an implementation of
    the repository interface. Spring Data JPA creates an implementation when you run the application.
     */
}
