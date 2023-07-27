package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="gnl_tp")
public class GnlTpEntity extends BaseEntity {
    @Id
    @Column(name="gnl_tp_id")
    int typeId;
    @OneToMany(mappedBy = "gnlTpEntity",cascade = CascadeType.ALL)
    private List<ProdOfrEntity> prodOfrEntities;

    @OneToMany(mappedBy = "gnlTpEntity",cascade = CascadeType.ALL)
    private List<DarwinUserEntity> userEntities;

    @Column(name="name")
    private String name;

    @Column(name="descr")
    private String descr;
    @Column(name="shr_code")
    private String shortCode;

    @Column(name="ent_code_name")
    private String entityCodeName;
    @Column(name="is_actv")
    private boolean isActive;

    public GnlTpEntity() {
    }

    public GnlTpEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser, int typeId, String name, String descr, String shortCode, String entityCodeName, boolean isActive) {
        super(cdate, cuser, udate, uuser);
        this.typeId = typeId;
        this.name = name;
        this.descr = descr;
        this.shortCode = shortCode;
        this.entityCodeName = entityCodeName;
        this.isActive = isActive;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public List<ProdOfrEntity> getProdOfrEntities() {
        return prodOfrEntities;
    }

    public void setProdOfrEntities(List<ProdOfrEntity> prodOfrEntities) {
        this.prodOfrEntities = prodOfrEntities;
    }

    public List<DarwinUserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<DarwinUserEntity> userEntities) {
        this.userEntities = userEntities;
    }

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

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getEntityCodeName() {
        return entityCodeName;
    }

    public void setEntityCodeName(String entityCodeName) {
        this.entityCodeName = entityCodeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
