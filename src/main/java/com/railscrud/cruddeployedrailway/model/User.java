package com.railscrud.cruddeployedrailway.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "User")
@Table(name = "tb_user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name blank")
    private String name;
    @Positive
    @NotNull(message = "Age can't be null")
    private Integer age;
    @Pattern(regexp = "\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d")
    private String register;
    @Email
    private String email;
    @Enumerated(EnumType.STRING)
    private CategoryPlace categoryPlace;

    public User (UserPostDTO dto) {
        this.name = dto.name();
        this.age = dto.age();
        this.register = dto.register();
        this.email = dto.email();
    }

    public void update(UserUpdateDTO dto) {
        this.name = dto.name();
        this.age = dto.age();
        this.register = dto.register();
        this.email = dto.email();
    }

    public CategoryPlace rankCategory(Integer age) {
        if (age <= 10) {
            return this.categoryPlace = CategoryPlace.KID;
        }
        if (age <= 17) {
            return this.categoryPlace = CategoryPlace.TEENAGE;
        }
        if (age <= 60) {
            return this.categoryPlace = CategoryPlace.ADULT;
        } else {
            return this.categoryPlace = CategoryPlace.ELDER;
        }
    }
}
