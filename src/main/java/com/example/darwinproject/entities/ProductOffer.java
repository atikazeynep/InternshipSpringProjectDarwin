package com.example.darwinproject.entities;

import java.time.LocalDate;

public class ProductOffer {
    private long prod_ofr_id;
    private String name;
    private String descr;
    private boolean is_actv;
    private LocalDate cdate;
    private DarwinUser cuser;
    private LocalDate udate;
    private DarwinUser uuser;
}
