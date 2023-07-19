package com.example.darwinproject.entities;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity(name="darwin_user")
//@Table(name="user")
public class DarwinUser {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private long user_id;
    private String scr_name;
    private String pwd;
    private String uname;

    private long st_id;
    private long user_tp_id;
    private LocalDate cdate;
    //private User cuser;
    private LocalDate udate;
    //private User uuser;


    public DarwinUser() {
        scr_name = "Empty user";
    }
}
