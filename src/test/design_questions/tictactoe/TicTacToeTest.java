package design_questions.tictactoe;

import design_questions.tictactoe.models.*;
import design_questions.tictactoe.strategies.playing.PlayingStrategy;
import design_questions.tictactoe.strategies.playing.RandomPlayingStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    public static final int BOARD_SIZE = 3;     // Screaming case

    @Test
    public void testCreateGame() {


        Game game = Game.builder()
                .withSize(BOARD_SIZE)
                .withPlayer(
                        HumanPlayer.builder()
                                .symbol(GameSymbol.O)
                                .user(new User())
                                .build()
                )
                .withPlayer(
                        Bot.builder()
                                .symbol(GameSymbol.X)
                                .playingStrategy(new RandomPlayingStrategy())
                                .level(GameLevel.EASY)
                                .build()
                )
                .build();

        assertEquals("If game is created, it should have 2 players",2,game.getPlayers().size());

/*Game game = Game.builder()
        .withSize(BOARD_SIZE)
        .withPlayer(new HumanPlayer(GameSymbol.O, new User()))
        .withPlayer(new Bot(GameSymbol.X,GameLevel.EASY,new RandomPlayingStrategy()))
        .build();*/



  /*  Board board = new Board(BOARD_SIZE);    //Magic numbers == hard coded values
    Player humanPlayer = new HumanPlayer(GameSymbol.O,new User());
    Player botPlayer = new Bot(GameSymbol.X, GameLevel.EASY, new RandomPlayingStrategy());
    Game game = new Game(board, List.of(humanPlayer,botPlayer), GameStatus.INPROGRESS);*/
    }

    @Test
    public void testCreateBoard() {
        Board board = new Board(3);
        int rowSize = board.getCells().size();
        assertEquals("If constructor of board is caled with n, then it should create n rows", 3, rowSize);

        int columns = board.getCells().get(0).size();
        assertEquals("If constructor of board is caled with n, then it should create n rows", 3, columns);
    }
}
