package com.scaler.userservicejul23.services;

import com.scaler.userservicejul23.models.Token;
import com.scaler.userservicejul23.models.User;

public interface UserService {

    User signUp(String name, String email, String password);

    Token login(String email, String password);

    User validateToken(String token);

    void logout(String token);

    User getUser(Long id);
}
