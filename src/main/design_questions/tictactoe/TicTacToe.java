package design_questions.tictactoe;

import design_questions.tictactoe.exceptions.InvalidStrategyException;
import design_questions.tictactoe.exceptions.InvalidSymbolException;
import design_questions.tictactoe.models.*;
import design_questions.tictactoe.strategies.playing.FirstCellStrategy;
import design_questions.tictactoe.strategies.playing.PlayingStrategy;
import design_questions.tictactoe.strategies.playing.RandomPlayingStrategy;

import java.util.Scanner;

//Client code
public class TicTacToe {
    private static final int BOARD_SIZE = 3;

    public static void main(String[] args) {
        // Ask for user input - name , email and Symbol

        HumanPlayer human =  getUserInput();
        System.out.println("Human human created" +human.getSymbol());

        // Create a game
        Game game = createGame(human);
        game.start();


        // Iteratively call make move
        // Untill -> Game is WON or DRAWN
        while (game.getGameStatus() == GameStatus.INPROGRESS){
            Player player = game.getNextPlayer();
            System.out.println("Next Player: "+player.getSymbol());

            game.makeMove();
            game.getBoard().printBoard();
        }

        //Initialise the bot player
    if (game.getGameStatus()==GameStatus.FINISHED){
        System.out.println("Game won by : " +game.getWinner().getSymbol());
    }
    if (game.getGameStatus()==GameStatus.DRAWN){
        System.out.println("Match Drawn");
    }

    }
public static Game createGame(HumanPlayer human){
    // you can also ask the user for the type of bot
    // Task 1: To take user input for the type of bot

    //ask the human for type of game H vs H or H vs B
    // Task 2 :take user input for the type of game

        Game game = Game.builder()
                .withSize(BOARD_SIZE)
                .withPlayer(human)
                .withPlayer(
                        Bot.builder()
                                .symbol(getBotSymbol(human.getSymbol()))
                                .playingStrategy(playingStrategy)
                                .level(GameLevel.EASY)
                                .build()
                )
                .build();
        return game;
}

    private static GameSymbol getBotSymbol(GameSymbol humanSymbol) {
        if (humanSymbol==GameSymbol.O){
            return GameSymbol.X;
        }
        return GameSymbol.O;
    }
   public static PlayingStrategy playingStrategy = null;
    private static HumanPlayer getUserInput() {
        System.out.println("Welcome to TicTacToe");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter Symbol : X or O");
        GameSymbol symbol ;
        try {
            symbol = GameSymbol.valueOf(sc.nextLine());
        } catch (IllegalArgumentException e) {
            throw new InvalidSymbolException();
        }
        System.out.println("Decide the playing strategy of bot");
        System.out.println("1. Random Playing strategy");
        System.out.println("2. First Cell strategy");
        int choice = sc.nextInt();

        playingStrategy = getPlayingStrategy(choice);


        User user = new User(name,email,null);
      return new HumanPlayer(symbol, user);
    }

    private static PlayingStrategy getPlayingStrategy(int choice) {

        switch (choice){
            case 1:
                return new RandomPlayingStrategy();
            case 2:
                return new FirstCellStrategy();
        }
        throw new InvalidStrategyException();
    }
}
