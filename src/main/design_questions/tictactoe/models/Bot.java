package design_questions.tictactoe.models;

import design_questions.tictactoe.strategies.playing.PlayingStrategy;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Bot extends Player {

    private GameLevel level;
    private PlayingStrategy playingStrategy;

    public Bot(GameSymbol symbol, GameLevel level, PlayingStrategy playingStrategy) {
        super(symbol);
        this.level = level;
        this.playingStrategy = playingStrategy;
    }

    @Override
    public BoardCell makeMove(Board board) {

        BoardCell boardCell= playingStrategy.makeMove(board);
        boardCell.setSymbol(getSymbol());
        return boardCell;
    }
}
