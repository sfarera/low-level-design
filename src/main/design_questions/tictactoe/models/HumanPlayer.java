package design_questions.tictactoe.models;


import lombok.experimental.SuperBuilder;

import java.util.Scanner;

//extrinsic state
@SuperBuilder
public class HumanPlayer extends Player {

    private User user;


    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }

    @Override
    public BoardCell makeMove(Board board) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        return new BoardCell(row, column, getSymbol());
    }
}
