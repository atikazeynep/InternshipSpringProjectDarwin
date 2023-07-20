package com.example.darwinproject.service;

import com.example.darwinproject.entities.DarwinUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private static List<DarwinUser> users = new ArrayList<>();
    //private static int usersCount=0;

    static{
        users.add(new DarwinUser("Atika", "1234", "atika", 321, 43, LocalDate.now(), LocalDate.now()));
        System.out.println("\nFIRST USER IS ADDED \n");
        users.add(new DarwinUser("Zeynep", "1234", "zeynep", 321, 43, LocalDate.now(), LocalDate.now()));
        System.out.println("\nSECOND USER IS ADDED \n");
        users.add(new DarwinUser("Evmez", "1234", "evmez", 321, 43, LocalDate.now(), LocalDate.now()));
        System.out.println("\nTHIRD USER IS ADDED \n");
    }

    public List<DarwinUser> findAll(){
        System.out.println("ALL USERS ARE SENT");
        return users;
    }

    public DarwinUser save(DarwinUser user){
        //user.setUser_id(++usersCount);
        users.add(user);
        return user;
    }
    public DarwinUser findOne(int id){
        Predicate<? super DarwinUser> predicate= user -> user.getUserId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id){
        Predicate<? super DarwinUser> predicate= user -> user.getUserId() == id;
        users.removeIf(predicate);
    }
}
