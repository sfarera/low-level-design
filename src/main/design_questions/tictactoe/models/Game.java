package design_questions.tictactoe.models;

import design_questions.tictactoe.exceptions.InvalidMoveException;
import design_questions.tictactoe.exceptions.InvalidPlayersException;
import design_questions.tictactoe.strategies.winning.NColumnWinStrategy;
import design_questions.tictactoe.strategies.winning.NDiagnolWinningStrategy;
import design_questions.tictactoe.strategies.winning.NRowsWinningStrategy;
import design_questions.tictactoe.strategies.winning.WinningStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Game {
    private static final int PLAYER_COUNT = 2;
    private static final GameStatus DEFAULT_STATUS = GameStatus.INPROGRESS;
    private static final int EMPTY_BOARD_SIZE = 0;
    private Board board;
    private WinningStrategy winningStrategy;
    private List<Player> players = new ArrayList<>();
    private GameStatus gameStatus;
    private int nextPlayerIndex = 0;
    private List<WinningStrategy> listOfStrategies = List.of(new NRowsWinningStrategy(),new NColumnWinStrategy(), new NDiagnolWinningStrategy());
    private Player winner;

    private Game() {
    }

    public void start() {
        // Assign a random value to the nextPlayerIndex
        // Random value 0 or 1
        //0.5 * 2 = 1.0 = 1
        //0.1 * 2 = 0.2 = 0
        //0.8 * 2 = 1.6 = 1
        nextPlayerIndex = (int) (Math.random() * players.size());
        // Set the status to IN_PROGRESS
        gameStatus = GameStatus.INPROGRESS;
    }

    public void makeMove() {
        // Get the next player (whose turn it is) , Oce you have the player the symbol is decided already
        // Get the next move from the player. (The move for both players will be different)
        // Validate the move - Check if the cell id already filled or not
        BoardCell move = getNextMove(board);
        // Bot  - Playing Strategy
        // User - Input Scanner


        // Update the board
        board.update(move);
        // Check for a winner
        if (checkWinner(move.getSymbol())) {
            gameStatus = GameStatus.FINISHED;
            winner = getNextPlayer();
            return;
        }
        // Check for a draw
        if (checkDraw(move.getSymbol())) {
            gameStatus = GameStatus.DRAWN;
            return;
        }

// Update the nextPlayer
        nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
    }


    private void validateMove(BoardCell move) {
        if (!board.isEmpty(move.getRow(), move.getColumn())) {
            throw new InvalidMoveException(move.getRow(), move.getColumn());
        }
    }

    private BoardCell getNextMove(Board board) {
        Player player = players.get(nextPlayerIndex);
        BoardCell move = player.makeMove(board);
        validateMove(move);
        return move;
    }

    public boolean checkWinner(GameSymbol symbol) {
        // implement check rows
        // implement check columns
        // implement check diagonals
        for (WinningStrategy strategy : listOfStrategies) {
            boolean hasWinner = strategy.checkWinner(getBoard(), symbol);
            if (hasWinner) {
                return true;
            }

        }

        return false;
    }

    public boolean checkDraw(GameSymbol symbol) {
        // Task 4 : Implement the check draw method
        // if no cell empty and there is no winner
        boolean drawStatus= false;
       if (getBoard().getEmptyCells().isEmpty() &&  (!checkWinner(symbol))){
           drawStatus=true;
           return drawStatus;
       }
       return drawStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Player getNextPlayer() {
        return players.get(nextPlayerIndex);
    }

    public static class Builder {
        private Game game;

        private Builder() {
            game = new Game();
        }

        public Builder withSize(int size) {
            this.game.board = new Board(size);
            return this;
        }

        public Builder withPlayer(Player player) {
            game.getPlayers().add(player);
            return this;
        }

        public Game build() {
            boolean isValid = validate();
            if (!isValid) {
                throw new InvalidPlayersException();
            }
            Game newGame = new Game();
            newGame.board = game.board;
            newGame.players = game.players;
            newGame.gameStatus = DEFAULT_STATUS;

            return newGame;
        }

        private boolean validate() {
            List<Player> players = game.players;
            if (players.size() != PLAYER_COUNT) {
                return false;
            }
            // If symbols are unique
            Set<GameSymbol> symbol = players.stream().map(Player::getSymbol)
                    .collect(Collectors.toSet());

            return symbol.size() == PLAYER_COUNT;
        }
    }
}
