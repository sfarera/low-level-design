package design_questions.tictactoe.strategies.playing;

import design_questions.tictactoe.models.Board;
import design_questions.tictactoe.models.BoardCell;

public interface PlayingStrategy {
    BoardCell makeMove(Board board);
}
