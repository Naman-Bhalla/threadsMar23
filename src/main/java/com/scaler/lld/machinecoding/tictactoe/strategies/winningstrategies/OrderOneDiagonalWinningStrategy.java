package com.scaler.lld.machinecoding.tictactoe.strategies.winningstrategies;

import com.scaler.lld.machinecoding.tictactoe.Main;
import com.scaler.lld.machinecoding.tictactoe.models.Board;
import com.scaler.lld.machinecoding.tictactoe.models.Move;
import com.scaler.lld.machinecoding.tictactoe.models.Player;
import com.scaler.lld.machinecoding.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneDiagonalWinningStrategy implements WinningStrategy {
    private final Map<Symbol, Integer> leftDiagMap;
    private final Map<Symbol, Integer> rightDiagMap;

    public OrderOneDiagonalWinningStrategy(List<Player> players) {
        leftDiagMap = new HashMap<>();
        rightDiagMap = new HashMap<>();

        for (Player player: players) {
            leftDiagMap.put(player.getSymbol(), 0);
            rightDiagMap.put(player.getSymbol(), 0);
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row == col) {
            leftDiagMap.put(symbol, leftDiagMap.get(symbol) + 1);
        }

        if (row + col == board.getSize() - 1) {
            rightDiagMap.put(symbol, rightDiagMap.get(symbol) + 1);
        }

        if (row == col) {
            if (leftDiagMap.get(symbol) == board.getSize()) {
                return true;
            }
        }

        if (row + col == board.getSize() - 1) {
            if (rightDiagMap.get(symbol) == board.getSize()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row == col) {
            leftDiagMap.put(
                symbol, leftDiagMap.get(symbol) - 1
            );
        }

        if (row + col == board.getSize() - 1) {
            rightDiagMap.put(
                    symbol, rightDiagMap.get(symbol) - 1
            );
        }
    }
}
