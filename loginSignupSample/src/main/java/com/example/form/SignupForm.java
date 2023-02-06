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
    
    @NotBlank(groups = ValidGroup1.class)
    @Email(groups = ValidGroup2.class)
    String userId,
    
    @NotBlank(groups = ValidGroup1.class)
    @Length(min = 4, max = 100,groups = ValidGroup2.class)
    @Pattern(regexp = "^[a-zA-Z0-9]+$",groups = ValidGroup2.class)
    String password,
    
    @NotBlank(groups = ValidGroup1.class)
    String userName,
    
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @NotNull(groups = ValidGroup1.class)
    Date birthday,
    
    @Min(value = 20,groups = ValidGroup2.class)
    @Max(value =  100,groups = ValidGroup2.class)
    Integer age,
    
    @NotNull(groups = ValidGroup1.class)
    Integer gender
) {
}