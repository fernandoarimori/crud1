package com.railscrud.cruddeployedrailway.model;

public record UserResponseDTO(
        String name,
        Integer age,
        String register,
        String email,
        CategoryPlace categoryPlace
) {
    public UserResponseDTO(User u) {
        this(u.getName(), u.getAge(), u.getRegister(), u.getEmail(), u.getCategoryPlace());
    }
}
