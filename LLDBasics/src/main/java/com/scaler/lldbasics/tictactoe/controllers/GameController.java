package com.scaler.lldbasics.tictactoe.controllers;

import com.scaler.lldbasics.tictactoe.exceptions.InvalidBotCountException;
import com.scaler.lldbasics.tictactoe.exceptions.InvalidPlayerCountException;
import com.scaler.lldbasics.tictactoe.models.Game;
import com.scaler.lldbasics.tictactoe.models.Player;
import com.scaler.lldbasics.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException {
        Game game = Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
        return game;
    }

    public void makeMove() {

    }

    public void printGame() {

    }

    public Player getWinner() {
        return null;
    }
}
