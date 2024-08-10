package com.scaler.lldbasics.tictactoe.strategies.winningstrategies;

import com.scaler.lldbasics.tictactoe.models.Board;
import com.scaler.lldbasics.tictactoe.models.Move;
import com.scaler.lldbasics.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol, Integer> leftDiagonal = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonal = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        Symbol symbol = move.getPlayer().getSymbol();

        // CHeck for the left diagonal
        if(row == col) {
            if(!leftDiagonal.containsKey(symbol)) {
                leftDiagonal.put(symbol, 0);
            }
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) + 1);
            // Check for winner here
            if(leftDiagonal.get(symbol) == (board.getDimension())) {
                return true;
            }
        }
        // Check for the right diagonal
        if(row + col == board.getDimension() - 1) {
            if(!rightDiagonal.containsKey(symbol)) {
                rightDiagonal.put(symbol, 0);
            }
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) + 1);
            // Check for winner here
            if(rightDiagonal.get(symbol) == (board.getDimension())) {
                return true;
            }
        }

        return false;

    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        Symbol symbol = move.getPlayer().getSymbol();
        if (row == col) {
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) - 1);
        }

        if (row + col == board.getDimension() - 1) {
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) - 1);
        }
    }
}
