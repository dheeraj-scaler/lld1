package com.scaler.userservicejul23.controllers;

import com.scaler.userservicejul23.dtos.*;
import com.scaler.userservicejul23.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public LoginResponseDto login(LoginRequestDto requestDto) {

        return null;

    }


    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        return null;

    }

    public UserDto validateToken(ValidateTokenRequestDto requestDto) {
        return null;
    }

    public LogoutResponseDto logout(LogoutRequestDto requestDto) {
        return null;

    }
}
