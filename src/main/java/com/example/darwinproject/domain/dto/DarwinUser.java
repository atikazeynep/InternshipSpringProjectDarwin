package com.example.darwinproject.domain.dto;


import com.example.darwinproject.util.ValidUsername;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

public class DarwinUser extends Base{
    private Long userId;
    @NotEmpty(message = "Screen name is mandatory")
    private String screenName;
    private String password;
    @Valid
    @NotEmpty(message = "Username is mandatory")
    @UniqueElements(message = "Username must be unique")
    @Size(min = 2, max = 10, message = "Username must be longer than 2 and shorter than 10")
    @ValidUsername
    private String userName;
    private GeneralStatus status;
    private GeneralType userType;

    public DarwinUser() {
    }

    public DarwinUser(Long userId, String screenName, String userName, GeneralStatus status, GeneralType userType) {
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
