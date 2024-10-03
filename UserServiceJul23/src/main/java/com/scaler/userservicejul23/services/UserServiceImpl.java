package com.scaler.userservicejul23.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scaler.userservicejul23.dtos.SendEmailEventDto;
import com.scaler.userservicejul23.models.Token;
import com.scaler.userservicejul23.models.User;
import com.scaler.userservicejul23.repositories.TokenRepository;
import com.scaler.userservicejul23.repositories.UserRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;
import java.util.random.RandomGenerator;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private TokenRepository tokenRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private KafkaTemplate<String, String> kafkaTemplate;
    private ObjectMapper objectMapper;

    public UserServiceImpl(UserRepository userRepository, TokenRepository tokenRepository, BCryptPasswordEncoder bCryptPasswordEncoder, KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
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
            user = optionalUser.get();
            SendEmailEventDto emailEventDto = new SendEmailEventDto();
            emailEventDto.setTo(email);
            emailEventDto.setFrom("dheeraj.kumar_1@scaler.com");
            emailEventDto.setSubject("Welcome to Scaler");
            emailEventDto.setBody("Welcome to Scaler, We are very happy to have you on our platform. All the best!!");


            try {
                kafkaTemplate.send(
                        "sendEmail",
                        objectMapper.writeValueAsString(emailEventDto)
                );
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        } else {
            // create the user in database
            user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setHashedPassword(bCryptPasswordEncoder.encode(password));

            user = userRepository.save(user);

            SendEmailEventDto emailEventDto = new SendEmailEventDto();
            emailEventDto.setTo(email);
            emailEventDto.setFrom("dheeraj.kumar_1@scaler.com");
            emailEventDto.setSubject("Welcome to Scaler platform");
            emailEventDto.setBody("Welcome to Scaler, We are very happy to have you on our platform. All the best!!");

            try {
                kafkaTemplate.send(
                        "sendEmail",
                        objectMapper.writeValueAsString(emailEventDto)
                );
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }

        return user;
    }

    private Token createToken(User user) {
        Token token = new Token();
        token.setUser(user);
        token.setValue("abcdefgh");

        // FIXME
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysLater = today.plus(30, ChronoUnit.DAYS);

        Date expiryAt = Date.from(thirtyDaysLater.atStartOfDay(ZoneId.systemDefault()).toInstant());

        token.setExpiryAt(expiryAt);

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
        // Fetch the token from db and check if it is expired or not
        // If expired, return null
        // else return user

        Optional<Token> optionalToken = tokenRepository.findByValueAndDeletedAndExpiryAtGreaterThan(
                token,
                false,
                new Date()
        );

        if(optionalToken.isEmpty()) {
            // Throw some exception
            return null;
        }

        return optionalToken.get().getUser();
    }

    @Override
    public void logout(String token) {
        // set deleted as true in tokens
    }

    @Override
    public User getUser(Long id) {
        User user = userRepository.getById(id);

        return user;
    }
}
