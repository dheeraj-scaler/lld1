package com.scaler.lldbasics.tictactoe.strategies.winningstrategies;

import com.scaler.lldbasics.tictactoe.models.Board;
import com.scaler.lldbasics.tictactoe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
