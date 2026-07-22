package design_questions.tictactoe.strategies.winning;

import design_questions.tictactoe.models.Board;
import design_questions.tictactoe.models.GameSymbol;

public interface WinningStrategy {

    boolean checkWinner(Board board, GameSymbol symbol);
}
// Task 5 :Implement column and diagonal strategy