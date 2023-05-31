package com.scaler.lld.machinecoding.tictactoe.controllers;

import com.scaler.lld.machinecoding.tictactoe.exceptions.InvalidGameParamsException;
import com.scaler.lld.machinecoding.tictactoe.models.Game;
import com.scaler.lld.machinecoding.tictactoe.models.GameStatus;
import com.scaler.lld.machinecoding.tictactoe.models.Player;
import com.scaler.lld.machinecoding.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension,
                           List<Player> players,
                           List<WinningStrategy> winningStrategies) throws InvalidGameParamsException {

        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void displayBoard(Game game) {
        game.printBoard();
    }

    public void undo(Game game) {
        game.undo();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void printResult(Game game) {
        game.printResult();
    }
}
