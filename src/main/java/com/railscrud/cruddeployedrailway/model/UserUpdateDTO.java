package com.railscrud.cruddeployedrailway.model;

import jakarta.validation.constraints.*;

public record UserUpdateDTO(
        @NotNull(message = "Need id")
        Long id,
        @NotBlank(message = "Name blank")
        String name,
        @Positive
        @NotNull(message = "Age can't be null")
        Integer age,
        @Pattern(regexp = "\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d")
        String register,
        @Email
        String email

) {
}
