package com.scaler.lldbasics.tictactoe.strategies.winningstrategies;

import com.scaler.lldbasics.tictactoe.models.Board;
import com.scaler.lldbasics.tictactoe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
