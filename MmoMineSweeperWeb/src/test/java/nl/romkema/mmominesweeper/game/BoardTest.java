package nl.romkema.mmominesweeper.game;

import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void testNumberOfBombs() {
        Board board = new Board();
        int i = board.numberOfBombs(10, BoardComplexity.EASY);
        System.out.println(i);
    }
}
