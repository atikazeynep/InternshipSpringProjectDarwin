package com.example.darwinproject.util;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {
    String message() default "Invalid username. It should be all lowercase and contain only English alphabet letters.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
