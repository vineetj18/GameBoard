package org.example;

public class Board {
    private final int sizeOfBoard;
    private final Cell [][] cells;

    public Board(int sizeOfBoard) {
        this.sizeOfBoard = sizeOfBoard;
        cells = new Cell[sizeOfBoard][sizeOfBoard];
    }
}
