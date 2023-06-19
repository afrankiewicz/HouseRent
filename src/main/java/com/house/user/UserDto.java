package com.house.user;

import jakarta.validation.constraints.NotBlank;

public class UserDto {

    private Long id;

    @NotBlank(message = "email must be provided")
    private String email;

    public UserDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public UserModel toModel() {
        return new UserModel(id, email);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
