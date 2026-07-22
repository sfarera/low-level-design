package design_questions.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoardCell {
    private int row;
    private int column;
    private GameSymbol symbol;

    public BoardCell(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
