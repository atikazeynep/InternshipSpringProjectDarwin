package com.example.darwinproject.service;
import com.example.darwinproject.domain.entities.DarwinUserEntity;
import com.example.darwinproject.domain.entities.GnlTpEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private GnlTpEntity type;
    private static final List<DarwinUserEntity> users = new ArrayList<>();

    public List<DarwinUserEntity> findAll() {
        System.out.println("ALL USERS ARE SENT");
        return users;
    }

    public DarwinUserEntity save(DarwinUserEntity user) {
        //user.setUser_id(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(long id) {
        Predicate<? super DarwinUserEntity> predicate = user -> user.getUserId() == id;
        users.removeIf(predicate);
    }

    public DarwinUserEntity findById(long id) {
        Predicate<? super DarwinUserEntity> predicate = user -> user.getUserId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

}
