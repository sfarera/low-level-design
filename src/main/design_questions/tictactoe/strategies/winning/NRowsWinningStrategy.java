package design_questions.tictactoe.strategies.winning;

import design_questions.tictactoe.models.Board;
import design_questions.tictactoe.models.BoardCell;
import design_questions.tictactoe.models.GameSymbol;

import java.util.List;

public class NRowsWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, GameSymbol currentSymbol) {
        // Check if any symbol in the same row are the same
        for (List<BoardCell> rows : board.getCells()) {
            boolean isWinner = true;
            for (BoardCell cell : rows) {
                if (cell.getSymbol() != currentSymbol) {
                    isWinner = false;
                    break;
                }
            }
            if (isWinner) {
                return true; // early return if winner is found
            }
        }
        return false;
    }
}
