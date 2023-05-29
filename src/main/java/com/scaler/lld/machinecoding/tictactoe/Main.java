package com.scaler.lld.machinecoding.tictactoe;

import com.scaler.lld.machinecoding.tictactoe.controllers.GameController;
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

        try {
            game = gameController.createGame(
                    3,
                    List.of(
                            new Player(new Symbol('X'), "Naman", PlayerType.HUMAN),
                            new Bot(new Symbol('O'), "Aman", BotDifficultyLevel.EASY)
                    ),
                    List.of(
                            new OrderOneDiagonalWinningStrategy(),
                            new OrderOneColumnWinningStrategy(),
                            new OrderOneRowWinningStrategy()
                    )
            );
        } catch (Exception e) {
            System.out.println("Somethng went wrong");
            return;
        }

//        Game.Builder gameBuilder = new Game.Builder();

        // while game status in progress
        while (gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)) {
            // print board
            gameController.displayBoard(game);
            // print if undo
            System.out.println("Do you want to undo? (y/n)");
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
        // else -> print draw
    }
}
