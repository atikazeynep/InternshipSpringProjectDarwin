package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="prod_ofr_char_val")
public class ProdOfrCharValEntity extends BaseEntity {
    @Id
    @Column(name="prod_ofr_char_val_id")
    private long id;
    @Column(name="prod_ofr_id")
    private long offerId;

    @Column(name="default_selected")
    private boolean isSlctd;
    private String name;
    private String descr;
    @Column(name="shrt_code")
    private String shrtCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private GnlChar gnlChar;

    @Column(name="is_actv")
    private boolean isActive;

    private String val;
    public ProdOfrCharValEntity() {
    }

    public ProdOfrCharValEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser, long id, long offerId, boolean isSlctd, String name, String descr, String shrtCode, GnlStEntity gnlStEntity, boolean isActive, String val) {
        super(cdate, cuser, udate, uuser);
        this.id = id;
        this.offerId = offerId;
        this.isSlctd = isSlctd;
        this.name = name;
        this.descr = descr;
        this.shrtCode = shrtCode;
        this.gnlStEntity = gnlStEntity;
        this.isActive = isActive;
        this.val = val;
    }
}
