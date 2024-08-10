package com.scaler.lldbasics.tictactoe.strategies.botplayingstrategies;

import com.scaler.lldbasics.tictactoe.models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {

        for(List<Cell> row : board.getBoard()) {
            for(Cell cell: row) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}
