package com.scaler.lldbasics.tictactoe.factory;

import com.scaler.lldbasics.tictactoe.models.BotDifficultyLevel;
import com.scaler.lldbasics.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.scaler.lldbasics.tictactoe.strategies.botplayingstrategies.EasyBotPlayingStrategy;
import com.scaler.lldbasics.tictactoe.strategies.botplayingstrategies.HardBotPlayingStrategy;
import com.scaler.lldbasics.tictactoe.strategies.botplayingstrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if( botDifficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }

        return null;
    }
}
