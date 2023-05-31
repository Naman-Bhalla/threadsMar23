package com.scaler.lld.machinecoding.tictactoe.strategies.winningstrategies;

import com.scaler.lld.machinecoding.tictactoe.models.Board;
import com.scaler.lld.machinecoding.tictactoe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
