
package com.house.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    public UserModel() {
    }

    public UserModel(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public UserDto toDto() {
        return new UserDto(id, email);
    }
}
