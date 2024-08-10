package com.scaler.lldbasics.tictactoe.strategies.winningstrategies;

import com.scaler.lldbasics.tictactoe.models.Board;
import com.scaler.lldbasics.tictactoe.models.Move;
import com.scaler.lldbasics.tictactoe.models.Symbol;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy {

    private HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getColumn();
        Symbol sym = move.getPlayer().getSymbol();
        if(!counts.containsKey(col)) {
            counts.put(col, new HashMap<>());
        }

        HashMap<Symbol, Integer> colMap = counts.get(col);

        if(!colMap.containsKey(sym)) {
            colMap.put(sym, 0);
        }

        colMap.put(sym, colMap.get(sym) + 1);

        if(colMap.get(sym) == (board.getDimension())) {
            return true;
        }

        return false;

    }
}
