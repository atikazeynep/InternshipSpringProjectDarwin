package com.example.darwinproject.entities;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerOrder {
    private long cust_ord_id;
    private long prod_ofr_id;
    private long usr_id;
    private long cust_ord_st_id;
    private LocalDateTime cdate;
    private DarwinUser cuser;
    private LocalDate udate;
    private DarwinUser uuser;

}
