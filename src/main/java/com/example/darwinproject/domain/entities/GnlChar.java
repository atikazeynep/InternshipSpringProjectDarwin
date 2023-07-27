package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="gnl_char ")
public class GnlChar extends BaseEntity{
    @Id
    @Column(name="gnl_char_id")
    private Long gnlCharId;
    @Column(name="name")
    private String name;
    @Column(name="descr")
    private String descr;
    @Column(name="shrt_code")
    private String shrtCode;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;

    @OneToMany(mappedBy = "gnlChar",cascade = CascadeType.ALL)
    private List<ProdOfrCharEntity> prodOfrCharEntities;

    @OneToMany(mappedBy = "gnlChar",cascade = CascadeType.ALL)
    private List<ProdOfrCharValEntity> prodOfrCharValEntities;

    public Long getGnlCharId() {
        return gnlCharId;
    }

    public void setGnlCharId(Long gnlCharId) {
        this.gnlCharId = gnlCharId;
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

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }
}
