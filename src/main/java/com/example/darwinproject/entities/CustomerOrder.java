package com.example.darwinproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name="cust_ord")
public class CustomerOrder {
    @Id
    private long cust_ord_id;
    private long prod_ofr_id;
    private long usr_id;
    private long cust_ord_st_id;
    private LocalDateTime cdate;
    @ManyToOne
    @JoinColumn(name="cuser")
    private DarwinUser cuser;
    private LocalDate udate;
    @ManyToOne
    @JoinColumn(name="uuser")
    private DarwinUser uuser;

}
