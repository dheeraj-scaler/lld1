package com.scaler.bmsaug24.dtos;

import com.scaler.bmsaug24.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private User user;
}
