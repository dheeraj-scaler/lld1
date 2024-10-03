package com.scaler.userservicejul23.dtos;

import com.scaler.userservicejul23.models.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private String email;
    private List<Role> roles;

    @Override
    public String toString() {
        return "UserDto{" +
                "email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
