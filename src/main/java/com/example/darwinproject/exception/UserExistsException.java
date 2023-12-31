package com.example.darwinproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
public class UserExistsException extends RuntimeException {
    public UserExistsException(String s) {
        super(s);
    }
}
