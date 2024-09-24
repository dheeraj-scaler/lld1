package com.scaler.userservicejul23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Token extends BaseModel {
    private String value;
    private Date expiryAt;

    @ManyToOne
    private User user;
}



/*
1            1
Token       User
 M            1
 */