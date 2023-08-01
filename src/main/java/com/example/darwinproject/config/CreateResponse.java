package com.example.darwinproject.config;

import java.time.LocalDate;

public class CreateResponse {
    private Long userId;
    private String screenName;
    private String userName;
    private LocalDate creationDate;

    public CreateResponse(Long userId, String screenName, String userName, LocalDate creationDate) {
        this.userId = userId;
        this.screenName = screenName;
        this.userName = userName;
        this.creationDate = creationDate;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
