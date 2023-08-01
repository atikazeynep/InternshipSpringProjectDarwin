package com.example.darwinproject.util;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        // Check if the username is all lowercase and contains only English alphabet letters.
        return username != null && username.matches("^[a-z]+$");
    }
}
