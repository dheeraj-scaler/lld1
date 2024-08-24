package com.scaler.bmsaug24;

import com.scaler.bmsaug24.controllers.UserController;
import com.scaler.bmsaug24.dtos.SignUpRequestDto;
import com.scaler.bmsaug24.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Bmsaug24Application implements CommandLineRunner {

    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(Bmsaug24Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        SignUpRequestDto requestDto = new SignUpRequestDto();
        requestDto.setName("Ashutosh");
        requestDto.setPassword("Ashutosh@123");
        requestDto.setEmail("Ashutosh@gmail.com");

        SignUpResponseDto responseDto = userController.signUpUser(requestDto);
    // HW : Create a show
        // Create a user
        // Make a booking

    }
}
