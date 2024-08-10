package com.scaler.lldbasics.tictactoe.models;

import com.scaler.lldbasics.tictactoe.exceptions.InvalidBotCountException;
import com.scaler.lldbasics.tictactoe.exceptions.InvalidPlayerCountException;
import com.scaler.lldbasics.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players,List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.INPROGRESS;
        this.nextPlayerMoveIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerMoveIndex);

        System.out.println(currentPlayer.getName() + "'s turn is there");

        Move move = currentPlayer.makeMove(board);

        System.out.println(currentPlayer.getName() + " is making the move at " + move.getCell().getRow() + " " + move.getCell().getColumn());

        // validate it (Homework)
        // Make the changes in the board
        // 1,1

        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        Cell cellToChange = board.getBoard().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setPlayer(currentPlayer);

        Move finalMoveObject = new Move(currentPlayer, cellToChange);
        moves.add(finalMoveObject);

        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();

        // After you have made a move, you need to check the
        // status of the game


    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validatePlayerCount() throws InvalidPlayerCountException {
            if(players == null) {
                // throw exception
            }
            if(players.size() != dimension - 1) {
                throw new InvalidPlayerCountException("Number of players is not correct");
            }
        }

        private void checkBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for(Player player: players) {
                if(player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount += 1;
                }
            }

            if(botCount > 1) {
                throw new InvalidBotCountException("Invalid number of bot players");
            }
        }

        private void differentSymbolForAllPlayers() {
            // Homework
            // Use sets if possible
        }

        private void validate() throws InvalidBotCountException, InvalidPlayerCountException {
            differentSymbolForAllPlayers();
            checkBotCount();
            validatePlayerCount();
        }

        public Game build() throws InvalidBotCountException, InvalidPlayerCountException {
            // validate all the things
            // Only 1 bot per game
            // Dimension-1 players should be there
            // All players should have different symbols
            validate();

            return new Game(dimension, players, winningStrategies);
        }
    }
}
