package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="darwin_user")
public class DarwinUserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    private long userId;
    @OneToMany(mappedBy = "usrEntity",cascade = CascadeType.ALL)
    private List<CustOrdEntity> custOrdEntities;
    @Column(name="scr_name")
    private String scrName;
    @Column(name="pwd")
    private String pwd;
    @Column(name="uname")
    private String uname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_id")
    private GnlTpEntity gnlTpEntity;

    public DarwinUserEntity() {

    }

    public DarwinUserEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser, Long userId, String scrName, String pwd, String uname, GnlStEntity gnlStEntity, GnlTpEntity gnlTpEntity) {
        super(cdate, cuser, udate, uuser);
        this.userId = userId;
        this.scrName = scrName;
        this.pwd = pwd;
        this.uname = uname;
        this.gnlStEntity = gnlStEntity;
        this.gnlTpEntity = gnlTpEntity;
    }

    public Long getUserId() {
        return userId;
    }

    public String getScrName() {
        return scrName;
    }

    public void setScrName(String scrName) {
        this.scrName = scrName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
