
package design_questions.tictactoe.strategies.winning;

import design_questions.tictactoe.models.Board;
import design_questions.tictactoe.models.BoardCell;
import design_questions.tictactoe.models.GameSymbol;

import java.util.List;

public class NDiagnolWinningStrategy implements WinningStrategy {


    @Override
    public boolean checkWinner(Board board, GameSymbol currentSymbol) {
        List<List<BoardCell>> boardCells = board.getCells();
        int size = boardCells.size();

        boolean isPrimaryWinner = true;
        for (int i = 0; i < size; i++) {
            if (boardCells.get(i).get(i).getSymbol() != currentSymbol) {
                isPrimaryWinner = false;
                break;
            }
        }
        if (isPrimaryWinner) {
            return true;
        }
        boolean isSecondaryWinner = true;
        for (int i = 0; i < size; i++) {
            if (boardCells.get(i).get(size - 1 - i).getSymbol() != currentSymbol) {
                isSecondaryWinner = false;
            }
        }
        if (isSecondaryWinner) {
            return true;
        }


        return false;
    }
}
