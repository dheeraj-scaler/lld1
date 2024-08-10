package com.scaler.lldbasics.tictactoe.strategies.botplayingstrategies;

import com.scaler.lldbasics.tictactoe.models.Board;
import com.scaler.lldbasics.tictactoe.models.Move;

public interface BotPlayingStrategy {

    Move makeMove(Board board);
}
