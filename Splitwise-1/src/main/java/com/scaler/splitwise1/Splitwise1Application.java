package com.scaler.splitwise1;

import com.scaler.splitwise1.commands.CommandExecutor;
import com.scaler.splitwise1.commands.RegisterCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Splitwise1Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CommandExecutor commandExecutor = new CommandExecutor();

        // Add all your commands in this
        commandExecutor.addCommand(new RegisterCommand());

        while(true) {
            String input = scanner.next();
            commandExecutor.executeCommand(input);
        }
    }

}
