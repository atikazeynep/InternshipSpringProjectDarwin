package com.example.darwinproject.domain.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
@MappedSuperclass
public class BaseEntity {
    @Column(name="cdate")
    private LocalDate cdate;
    //@Column(name="cuser")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cuser")
    private DarwinUserEntity cuser;
    @Column(name="udate")
    private LocalDate udate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uuser")
    private DarwinUserEntity uuser;

    public BaseEntity() {
    }

    public BaseEntity(LocalDate cdate, DarwinUserEntity cuser, LocalDate udate, DarwinUserEntity uuser) {
        this.cdate = cdate;
        this.cuser = cuser;
        this.udate = udate;
        this.uuser = uuser;
    }

    public LocalDate getCdate() {
        return cdate;
    }

    public void setCdate(LocalDate cdate) {
        this.cdate = cdate;
    }

    public DarwinUserEntity getCuser() {
        return cuser;
    }

    public void setCuser(DarwinUserEntity cuser) {
        this.cuser = cuser;
    }

    public LocalDate getUdate() {
        return udate;
    }

    public void setUdate(LocalDate udate) {
        this.udate = udate;
    }

    public DarwinUserEntity getUuser() {
        return uuser;
    }

    public void setUuser(DarwinUserEntity uuser) {
        this.uuser = uuser;
    }
}
