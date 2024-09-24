package com.scaler.userservicejul23.services;

import com.scaler.userservicejul23.models.Token;
import com.scaler.userservicejul23.models.User;
import com.scaler.userservicejul23.repositories.TokenRepository;
import com.scaler.userservicejul23.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;
import java.util.random.RandomGenerator;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private TokenRepository tokenRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository, TokenRepository tokenRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User signUp(String name, String email, String password) {
        // check is email present
        // if user is there, send them to login flow
        // else create a user in db

        Optional<User> optionalUser = userRepository.findByEmail(email);

        User user = null;

        if(optionalUser.isPresent()) {
            // Navigate them to login flow
        } else {
            // create the user in database
            user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setHashedPassword(bCryptPasswordEncoder.encode(password));

            user = userRepository.save(user);
        }

        return user;
    }

    private Token createToken(User user) {
        Token token = new Token();
        token.setUser(user);
        token.setValue("abcdefgh");

        // FIXME
//        LocalDate today = LocalDate.now();
//
//        token.setExpiryAt(Date.from(today.to));

        return token;
    }

    @Override
    public Token login(String email, String password) {
        // Get the user
        // if user does not exist -> signup
        // else create token

        User user = null;
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if(optionalUser.isEmpty()) {
            // sign up flow
        } else {
            user = optionalUser.get();

            if(!bCryptPasswordEncoder.matches(password, user.getHashedPassword())) {
                return null;
            }

            Token token = createToken(user);
            token = tokenRepository.save(token);
            return token;
        }
        return null;
     }

    @Override
    public User validateToken(String token) {
        return null;
    }

    @Override
    public void logout(String token) {

    }
}
