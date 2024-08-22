package com.scaler.bmsaug24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "users")
@Getter
@Setter
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
