package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="gnl_st")
public class GnlStEntity extends BaseEntity {
    @Id
    @Column(name="gnl_st_id")
    private int statusId;

    @OneToMany(mappedBy = "gnlStEntity",cascade = CascadeType.ALL)
    private List<ProdOfrEntity> prodOfrEntities;

    @OneToMany(mappedBy = "gnlStEntity",cascade = CascadeType.ALL)
    private List<ProdOfrCharValEntity> prodOfrChValEntities;
    @OneToMany(mappedBy = "gnlStEntity",cascade = CascadeType.ALL)
    private List<CustOrdEntity> custOrdEntities;
/*
    @OneToMany(mappedBy = "gnlStEntity",cascade = CascadeType.ALL)
    private List<DarwinUserEntity> userEntities;*/

    @Column(name="name")
    private String name;
    @Column(name="descr")

    private String descr;
    @Column(name="shrt_code")
    private String shrtCode;
    @Column(name="ent_code_name")
    private String entityName;

    private boolean is_actv;

    public GnlStEntity() {
    }

    public GnlStEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser, int statusId, String name, String descr, String shrtCode, String entityName, boolean is_actv) {
        super(cdate, cuser, udate, uuser);
        this.statusId = statusId;
        this.name = name;
        this.descr = descr;
        this.shrtCode = shrtCode;
        this.entityName = entityName;
        this.is_actv = is_actv;
    }


    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public List<ProdOfrEntity> getProdOfrEntities() {
        return prodOfrEntities;
    }

    public void setProdOfrEntities(List<ProdOfrEntity> prodOfrEntities) {
        this.prodOfrEntities = prodOfrEntities;
    }

    public List<ProdOfrCharValEntity> getProdOfrChValEntities() {
        return prodOfrChValEntities;
    }

    public void setProdOfrChValEntities(List<ProdOfrCharValEntity> prodOfrChValEntities) {
        this.prodOfrChValEntities = prodOfrChValEntities;
    }
/*
    public List<DarwinUserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<DarwinUserEntity> userEntities) {
        this.userEntities = userEntities;
}*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public boolean isIs_actv() {
        return is_actv;
    }

    public void setIs_actv(boolean is_actv) {
        this.is_actv = is_actv;
    }
}
