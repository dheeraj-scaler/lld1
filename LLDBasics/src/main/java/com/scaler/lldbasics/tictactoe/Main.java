package com.scaler.lldbasics.tictactoe;

import com.scaler.lldbasics.tictactoe.controllers.GameController;
import com.scaler.lldbasics.tictactoe.exceptions.InvalidBotCountException;
import com.scaler.lldbasics.tictactoe.exceptions.InvalidPlayerCountException;
import com.scaler.lldbasics.tictactoe.models.*;
import com.scaler.lldbasics.tictactoe.strategies.winningstrategies.ColWinningStrategy;
import com.scaler.lldbasics.tictactoe.strategies.winningstrategies.DiagonalWinningStrategy;
import com.scaler.lldbasics.tictactoe.strategies.winningstrategies.RowWinningStrategy;
import com.scaler.lldbasics.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException {
        Scanner scanner = new Scanner(System.in);
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player( "Gaurav",1, new Symbol('X'), PlayerType.HUMAN));
        players.add(new Bot( "Madhu",2, new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, winningStrategies);

        while(game.getGameState().equals(GameState.INPROGRESS)) {

            // Print the board
            // Make the move

            gameController.printBoard(game);

            System.out.println("If you want to undo? Enter y/n");
            String undo = scanner.next();

            if(undo.equalsIgnoreCase("y")) {
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        gameController.printBoard(game);


        // Make a check of game state
        // If the game is a draw, print message accordingly
        System.out.println(gameController.getWinner(game).getName());

    }
}
