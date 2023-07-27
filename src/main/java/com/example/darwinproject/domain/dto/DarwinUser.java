package com.example.darwinproject.domain.dto;

import com.example.darwinproject.domain.GeneralEnumerations;

public class DarwinUser extends Base{
    private Long userId;
    private String screenName;
    private String password;
    private String userName;
    private GeneralStatus status;
    private GeneralType userType;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public GeneralStatus getStatus() {
        return status;
    }

    public void setStatus(GeneralStatus status) {
        this.status = status;
    }

    public GeneralType getUserType() {
        return userType;
    }

    public void setUserType(GeneralType userType) {
        this.userType = userType;
    }
}
