package com.scaler.userservicejul23.dtos;

import com.scaler.userservicejul23.models.Token;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private Token token;
}
