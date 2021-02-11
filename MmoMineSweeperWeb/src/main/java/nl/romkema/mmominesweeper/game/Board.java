package nl.romkema.mmominesweeper.game;

import java.util.stream.Stream;

public class Board {
    private CellValue[][] cells;

    public void createBoard(int size, BoardComplexity complexity) {
        cells = new CellValue[size][size];
        plantBombs(size, complexity);
        populateCellValue();
    }


    public void plantBombs(int size, BoardComplexity complexity) {
        // TODO: plant bombs randomly
        int numberOfBombs = (int) (Math.random() * complexity.getBombsPerTenFields() * (size * size));
    }

    private void populateCellValue() {
        // TODO: go over each cell and determine their CellValue (if not a bomb)
//        Stream.of(cells).forEach(
//                row -> Stream.of(row).forEach(
//                        System.out::println
////                        cell -> ;// TODO: set value
//                ));
    }

    private void setCell(Cell cell) {
    }

    public int numberOfBombs(int size, BoardComplexity complexity) {
        return (int) (Math.random() * complexity.getBombsPerTenFields() * (size * size));
    }
}
