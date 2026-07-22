package design_questions.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
@Getter
public class Board {
    private int size;
    private List<List<BoardCell>> cells  = new ArrayList<>();

    public Board (int size){
        this.size = size;
        this.cells = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
    /*
    we dont want to use for loops for creating the board
    */
      /*  List<BoardCell> firstRow = Collections.nCopies(size,new BoardCell());
        List<List<BoardCell>> rows = Collections.nCopies(size,firstRow);
        this.cells=rows;*/


            List<List<BoardCell>> cells = new ArrayList<>();
            IntStream.range(0, size).forEach(row -> {
                List<BoardCell> rowCells = new ArrayList<>();
                IntStream.range(0, size).forEach(column -> rowCells.add(new BoardCell(row, column)));
                cells.add(rowCells);
            });
            return cells;


    }

    public boolean isEmpty(int row, int column) {
        return getBoardCell(row,column).getSymbol()==null;

    }

    public void update(BoardCell move) {
        getBoardCell(move.getRow(), move.getColumn()).setSymbol(move.getSymbol());
    }
    public void printBoard() {
        for (int i = 0; i < cells.size(); ++i) {
            for (int j = 0; j < cells.size(); ++j) {
                GameSymbol symbol = cells.get(i).get(j).getSymbol();

                if (symbol == null) {
                    System.out.printf(" | - | ");
                } else {
                    System.out.printf(" | " + symbol + " | ");
                }
            }
            System.out.printf("\n");
        }
    }
    private BoardCell getBoardCell(int row, int column) {
       return  cells.get(row).get(column);
    }

    public List<BoardCell> getEmptyCells() {
        // iterate over the cells
        // Flatten the array
        // filter out the cells where symbol != null;
        return cells.stream().flatMap(List :: stream)
                .filter(cell -> cell.getSymbol()==null)
                .toList();
    }
}
