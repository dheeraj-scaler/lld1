package com.scaler.bmsaug24.controllers;

import com.scaler.bmsaug24.dtos.SignUpRequestDto;
import com.scaler.bmsaug24.dtos.SignUpResponseDto;
import com.scaler.bmsaug24.models.User;
import com.scaler.bmsaug24.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUpUser(SignUpRequestDto requestDto) {
        User user = userService.signUp(
                requestDto.getName(), requestDto.getEmail(), requestDto.getPassword()
        );
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        signUpResponseDto.setUser(user);
        return signUpResponseDto;
    }

    // HW
    // Implement Sign in
}
