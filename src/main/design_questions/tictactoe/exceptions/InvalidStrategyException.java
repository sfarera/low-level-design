package design_questions.tictactoe.exceptions;

public class InvalidStrategyException extends RuntimeException {
    public InvalidStrategyException(){
        super("Invalid Strategy Selected");
    }
}
