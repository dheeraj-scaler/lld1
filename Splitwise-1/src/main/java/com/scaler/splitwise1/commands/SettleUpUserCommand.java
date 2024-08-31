package com.scaler.splitwise1.commands;

import java.util.List;

public class SettleUpUserCommand implements Command{
    @Override
    public boolean matches(String input) {
//        u1 SettleUp
//        u1 is asking to see the list of transactions they should perform to settle up


        List<String> words = List.of(input.split(" "));
        return (words.get(1).equals("SettleUp"));
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        Long userId = Long.valueOf(words.get(0));
        // Create UserSettleUpRequestDto
        // Call the settle up

        // Sign up method


    }
}
