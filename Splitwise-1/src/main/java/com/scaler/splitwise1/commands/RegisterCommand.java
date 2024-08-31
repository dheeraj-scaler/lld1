package com.scaler.splitwise1.commands;

import java.util.List;

public class RegisterCommand implements Command{
    @Override
    public boolean matches(String input) {
//        Register vinsmokesanji 003 namisswwaann
//        u1 is registering with the username "vinsmokesanji", phone "003" and password as "namisswwaann"

        List<String> words = List.of(input.split(" "));
        return (words.get(0).equals("Register"));
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        String name = words.get(1);
        String phoneNumber = words.get(2);
        String password = words.get(3);

        // Sign up method


    }
}
