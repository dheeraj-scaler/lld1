package com.scaler.userservicejul23.security.services;


import com.scaler.userservicejul23.models.User;
import com.scaler.userservicejul23.repositories.UserRepository;
import com.scaler.userservicejul23.security.models.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService  {
    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("User with the email : " + email + " not found");
        }

        //Convert user object into an object of type UserDetails.
        return new CustomUserDetails(optionalUser.get());
    }
}