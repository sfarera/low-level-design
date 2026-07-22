package design_questions.tictactoe.strategies.playing;

import design_questions.tictactoe.models.Board;
import design_questions.tictactoe.models.BoardCell;

import java.util.List;

public class RandomPlayingStrategy implements PlayingStrategy{

    @Override
    public BoardCell makeMove(Board board) {
        // Output -> A cell from the list of available cells

        // Get a list of empty cells
        List<BoardCell> emptyCells = board.getEmptyCells();

        // Generate a random index for cells
         int randomIndex = (int) (Math.random()* emptyCells.size());
        BoardCell boardCell = emptyCells.get(randomIndex);
        // Return the random cell
        return new BoardCell(boardCell.getRow(), boardCell.getColumn());
    }
}
// Task 3 : First Cell strategy
// Return the first empty cell