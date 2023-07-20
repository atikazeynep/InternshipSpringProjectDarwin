package com.example.darwinproject.exception;

import java.time.LocalDate;

public class ErrorDetails {
    private LocalDate timestamp;
    private String messsage, details;

    public ErrorDetails(LocalDate timestamp, String messsage, String details) {
        super();
        this.timestamp = timestamp;
        this.messsage = messsage;
        this.details = details;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getMesssage() {
        return messsage;
    }

    public String getDetails() {
        return details;
    }

    //message
    //details

}
