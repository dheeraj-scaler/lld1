package com.scaler.bmsaug24.services;

import com.scaler.bmsaug24.models.User;
import com.scaler.bmsaug24.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String name, String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        User user = null;
        if(optionalUser.isEmpty()) {
            // User is not registered
            user = new User();
            user.setEmail(name);
            user.setName(email);
            user.setPassword(password);

            user = userRepository.save(user);
        } else {
            // throw some User Already Exists Exception
        }

        return user;
     }

     // HW
    // Implement Sign in with email Id and pwd
    // Check if the password provided by user and in the db is same
}
