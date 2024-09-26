package com.scaler.userservicejul23.dtos;


import com.scaler.userservicejul23.models.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignUpResponseDto {

    private ResponseStatus responseStatus;
    private User user;
}
