package com.example.darwinproject.config;

import com.example.darwinproject.util.ValidUsername;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

public class CreateRequest {
    private Long userId;
    @NotEmpty(message = "Screen name is mandatory")
    private String screenName;

    @Valid
    @NotEmpty(message = "Username is mandatory")
    @Size(min = 2, max = 10, message = "Username must be longer than 2 and shorter than 10")
    @ValidUsername
    private String userName;
    private int status;
    private int userType;

    public CreateRequest(Long userId, String screenName, String userName, int status, int userType) {
        this.userId = userId;
        this.screenName = screenName;
        this.userName = userName;
        this.status = status;
        this.userType = userType;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
