package com.example.darwinproject.domain.dto;

import java.time.LocalDate;

public class Base {
    private LocalDate createDate;
    private DarwinUser createUser;
    private LocalDate updateDate;
    private DarwinUser updateUser;

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public DarwinUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(DarwinUser createUser) {
        this.createUser = createUser;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public DarwinUser getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(DarwinUser updateUser) {
        this.updateUser = updateUser;
    }
}
