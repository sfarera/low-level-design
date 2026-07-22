package design_questions.tictactoe.exceptions;

public class InvalidPlayersException extends RuntimeException {

    public InvalidPlayersException() {
        super("Invalid list of player!");
    }
}
