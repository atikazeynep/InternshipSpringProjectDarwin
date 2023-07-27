package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "prod_ofr")
public class ProdOfrEntity extends BaseEntity {
    @Id
    @Column(name = "prod_ofr_id")
    private Long id;
    private String name;
    private String descr;
    @Column(name = "is_actv")
    private boolean isActive;

    // GnlStEntity -> st_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_id")
    private GnlTpEntity gnlTpEntity;

    @OneToMany(mappedBy = "prodOfrEntity", cascade = CascadeType.ALL)
    private List<ProdOfrCharEntity> prodOfrCharEntity;

    //CustOrdEntity
    @OneToMany(mappedBy = "prodOfrEntity", cascade = CascadeType.ALL)
    private List<CustOrdEntity> custOrdEntities;


    public ProdOfrEntity() {
    }

    public ProdOfrEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser, Long id, String name, String descr, boolean isActive, GnlStEntity gnlStEntity, GnlTpEntity gnlTpEntity) {
        super(cdate, cuser, udate, uuser);
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.isActive = isActive;
        this.gnlStEntity = gnlStEntity;
        this.gnlTpEntity = gnlTpEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }

    public GnlTpEntity getGnlTpEntity() {
        return gnlTpEntity;
    }

    public void setGnlTpEntity(GnlTpEntity gnlTpEntity) {
        this.gnlTpEntity = gnlTpEntity;
    }
}
