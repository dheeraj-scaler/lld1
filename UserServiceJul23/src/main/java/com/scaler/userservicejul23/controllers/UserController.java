package com.scaler.userservicejul23.controllers;

import com.scaler.userservicejul23.dtos.*;
import com.scaler.userservicejul23.models.Token;
import com.scaler.userservicejul23.models.User;
import com.scaler.userservicejul23.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequestDto requestDto) {
        Token token = userService.login(
                requestDto.getEmail(),
                requestDto.getPassword()
        );

        LoginResponseDto responseDto = new LoginResponseDto();
        responseDto.setToken(token);

        return responseDto;

    }


    @PostMapping("/signup")
    public SignUpResponseDto signUp(@RequestBody SignUpRequestDto requestDto) {
       User user = userService.signUp(requestDto.getName(), requestDto.getEmail(), requestDto.getPassword());

       SignUpResponseDto responseDto = new SignUpResponseDto();
       responseDto.setResponseStatus(ResponseStatus.SUCCESS);
       responseDto.setUser(user);

       return responseDto;

    }

    public UserDto validateToken(ValidateTokenRequestDto requestDto) {
        return null;
    }

    public LogoutResponseDto logout(LogoutRequestDto requestDto) {
        return null;

    }
}
