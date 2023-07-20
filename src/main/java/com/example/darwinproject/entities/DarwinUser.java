package com.example.darwinproject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name="darwin_user")
public class DarwinUser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;
    @Column(name="scr_name")
    private String screenName;
    @Column(name="pwd")
    private String password;
    @Column(name="uname")
    private String userName;

    @Column(name="st_id")
    private long statusId;
    @Column(name="user_tp_id")
    private long userTypeId;
    @Past(message="cdate must be in past")
    @Column(name="cdate")
    private LocalDate creationDate;

    //@OneToOne
    //private DarwinUser creatorUser;
    @Past(message="udate must be in past")
    @Column(name="udate")
    private LocalDate updateDate;

    //@OneToOne
    //private DarwinUser updaterUser;


    public DarwinUser() {
        this.userId = 0L;
        this.screenName = "Empty user";
        this.password = "pwd";
        this.userName = "emptyName";
        this.statusId = 0;
        this.userTypeId = 0;
        this.creationDate = LocalDate.now();
        this.updateDate = LocalDate.now();
    }

    //creation_date,password,screen_name,status_id,update_date,user_name,user_type_id
    public DarwinUser(String scr_name, String pwd, String uname, long st_id, long user_tp_id, LocalDate cdate, LocalDate udate) {
        this.screenName = scr_name;
        this.password = pwd;
        this.userName = uname;
        this.statusId = st_id;
        this.userTypeId = user_tp_id;
        this.creationDate = cdate;
        this.updateDate = udate;
    }

    @Override
    public String toString() {
        return "DarwinUser{" +
                "userId=" + userId +
                ", screenName='" + screenName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", statusId=" + statusId +
                ", userTypeId=" + userTypeId +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    public long getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(long userTypeId) {
        this.userTypeId = userTypeId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }


    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
