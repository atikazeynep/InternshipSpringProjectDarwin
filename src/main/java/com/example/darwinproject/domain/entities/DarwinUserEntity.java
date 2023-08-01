package com.example.darwinproject.domain.entities;

import com.example.darwinproject.util.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Mod10Check;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="darwin_user")
public class DarwinUserEntity extends BaseEntity {
    @Id
    @GeneratedValue()
    private Long userId;
    @OneToMany(mappedBy = "usrEntity",cascade = CascadeType.ALL)
    private List<CustOrdEntity> custOrdEntities;
    @NotBlank(message = "Screen Name is mandatory")
    @Column(name="scr_name")
    private String scrName;
    @Column(name="pwd")
    private String pwd;
    @NotBlank(message = "Username is mandatory")
    @UniqueElements(message = "Username must be unique")
    @Size(min = 2, max = 10, message = "Username must be longer than 2 and shorter than 10")
    @ValidUsername
    @Column(name="uname")
    private String uname;

    @ManyToOne
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;
    @ManyToOne
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
