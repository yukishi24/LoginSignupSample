package com.example.form;

import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record SignupForm(
    
    @NotBlank
    @Email
    String userId,
    
    @NotBlank
    @Length(min = 4, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    String password,
    
    @NotBlank
    String userName,
    
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @NotNull
    Date birthday,
    
    @Min(20)@Max(100)
    Integer age,
    
    @NotNull
    Integer gender
) {
}