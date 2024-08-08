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

public class Main {

    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException {
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player( "Gaurav",1, new Symbol('X'), PlayerType.HUMAN));
        players.add(new Player( "Madhu",2, new Symbol('O'), PlayerType.HUMAN));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, winningStrategies);

        while(game.getGameState().equals(GameState.INPROGRESS)) {

            // Print the board
            // Make the move

            gameController.printGame();

            gameController.makeMove();
        }

    }
}
