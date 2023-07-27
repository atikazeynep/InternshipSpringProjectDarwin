package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cust_ord_char_val")
public class CustOrdChValEntity extends BaseEntity {
    @Id
    @Column(name = "cust_ord_char_val_id")
    private long id;
    @Column(name = "val")
    private String val;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_char_st_id")
    private GnlStEntity gnlStEntity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_id")
    private CustOrdEntity custOrdEntity;


    public CustOrdChValEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }

    public CustOrdEntity getCustOrdEntity() {
        return custOrdEntity;
    }

    public void setCustOrdEntity(CustOrdEntity custOrdEntity) {
        this.custOrdEntity = custOrdEntity;
    }
}
