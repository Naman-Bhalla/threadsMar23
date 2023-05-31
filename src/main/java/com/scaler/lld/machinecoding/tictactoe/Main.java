package com.scaler.lld.machinecoding.tictactoe;

import com.scaler.lld.machinecoding.tictactoe.controllers.GameController;
import com.scaler.lld.machinecoding.tictactoe.exceptions.InvalidGameParamsException;
import com.scaler.lld.machinecoding.tictactoe.models.*;
import com.scaler.lld.machinecoding.tictactoe.strategies.winningstrategies.OrderOneColumnWinningStrategy;
import com.scaler.lld.machinecoding.tictactoe.strategies.winningstrategies.OrderOneDiagonalWinningStrategy;
import com.scaler.lld.machinecoding.tictactoe.strategies.winningstrategies.OrderOneRowWinningStrategy;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a game
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);

        Game game;
        List<Player> players = List.of(
                new Player(new Symbol('X'), "Naman", PlayerType.HUMAN),
                new Bot(new Symbol('O'), "Aman", BotDifficultyLevel.EASY)
        );
        int dimension = 3;

        try {
            game = gameController.createGame(
                    dimension,
                    players,
                    List.of(
                            new OrderOneDiagonalWinningStrategy(players),
                            new OrderOneColumnWinningStrategy(dimension, players),
                            new OrderOneRowWinningStrategy(dimension, players)
                    )
            );
        } catch (InvalidGameParamsException e) {
            System.out.println("Seems like you gave invalid params. Update those.");
            return;
        }

//        Game.Builder gameBuilder = new Game.Builder();
        System.out.println("-------------- Game is starting --------------");

        // while game status in progress
        while (gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)) {
            System.out.println("This is how board looks like:");
            // print board
            gameController.displayBoard(game);
            // print if undo
            System.out.println("Does anyone want to undo? (y/n)");
            // if yes -> call undo
            String input = scanner.next();

            if (input.equalsIgnoreCase("y")) {
                gameController.undo(game);
            } else {
                // move next player
                gameController.makeMove(game);
            }
        }
        // check status of game


        gameController.printResult(game);
        gameController.displayBoard(game);
        // else -> print draw
    }
}
