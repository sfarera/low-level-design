package design_questions.tictactoe.strategies.playing;

import design_questions.tictactoe.models.Board;
import design_questions.tictactoe.models.BoardCell;

import java.util.List;

public class FirstCellStrategy implements PlayingStrategy {
    private static final int FIRST_CELL = 0;

    @Override
    public BoardCell makeMove(Board board) {
        List<BoardCell> boardEmptyCells = board.getEmptyCells();
        if (boardEmptyCells.isEmpty()) {
            return null;
        }
        return new BoardCell(boardEmptyCells.get(FIRST_CELL).getRow(), boardEmptyCells.get(FIRST_CELL).getColumn());

    }
}
