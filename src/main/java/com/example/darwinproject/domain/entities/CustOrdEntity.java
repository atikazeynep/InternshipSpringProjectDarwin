package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="cust_ord")
public class CustOrdEntity extends BaseEntity {
    @Id
    @Column(name="cust_ord_id")
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private ProdOfrEntity prodOfrEntity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usr_id")
    private DarwinUserEntity usrEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_st_id")
    private GnlStEntity gnlStEntity;

    /*
    @OneToMany(mappedBy = "custOrdEntity",cascade = CascadeType.ALL)
    private List<CustOrdChValEntity> custOrdChValEntities;*/

    public CustOrdEntity() {
    }

    public CustOrdEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser, long id, ProdOfrEntity prodOfrEntity, DarwinUserEntity usrEntity, GnlStEntity gnlStEntity) {
        super(cdate, cuser, udate, uuser);
        this.id = id;
        this.prodOfrEntity = prodOfrEntity;
        this.usrEntity = usrEntity;
        this.gnlStEntity = gnlStEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public DarwinUserEntity getUsrEntity() {
        return usrEntity;
    }

    public void setUsrEntity(DarwinUserEntity usrEntity) {
        this.usrEntity = usrEntity;
    }
/*
    public List<CustOrdChValEntity> getCustOrdChValEntities() {
        return custOrdChValEntities;
    }

    public void setCustOrdChValEntities(List<CustOrdChValEntity> custOrdChValEntities) {
        this.custOrdChValEntities = custOrdChValEntities;
    }*/

    public ProdOfrEntity getProdOfrEntity() {
        return prodOfrEntity;
    }

    public void setProdOfrEntity(ProdOfrEntity prodOfrEntity) {
        this.prodOfrEntity = prodOfrEntity;
    }

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }
}
