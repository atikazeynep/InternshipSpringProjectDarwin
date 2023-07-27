package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name="prod_ofr_char ")
public class ProdOfrCharEntity extends BaseEntity{
    @Id
    @Column(name="prd_ofr_char_id")
    private Long prodOfrCharId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private GnlChar gnlChar;

    private String name;
    private String descr;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private ProdOfrEntity prodOfrEntity;

    @Column(name="shrt_code")
    private String shrtCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;



    public Long getProdOfrCharId() {
        return prodOfrCharId;
    }

    public void setProdOfrCharId(Long prodOfrCharId) {
        this.prodOfrCharId = prodOfrCharId;
    }

    public GnlChar getGnlChar() {
        return gnlChar;
    }

    public void setGnlChar(GnlChar gnlChar) {
        this.gnlChar = gnlChar;
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

    public ProdOfrEntity getProdOfrEntity() {
        return prodOfrEntity;
    }

    public void setProdOfrEntity(ProdOfrEntity prodOfrEntity) {
        this.prodOfrEntity = prodOfrEntity;
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
