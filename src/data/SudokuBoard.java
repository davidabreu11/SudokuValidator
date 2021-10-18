package data;

public class SudokuBoard {

    int[][] sudokuBoard;

    public SudokuBoard() {
        // default or assigned sudoku board
        sudokuBoard = new int[9][9];
    }

    public SudokuBoard(int[][] arr) {
        sudokuBoard = arr;
    }

    public int getSudokuBoardVal(int row, int column) {
        return sudokuBoard[row][column];
    }

    /*
    {6, 2, 4, 5, 3, 9, 1, 8, 7},
                {5, 1, 9, 7, 2, 8, 6, 3, 4},
                {8, 3, 7, 6, 1, 4, 2, 9, 5},
                {1, 4, 3, 8, 6, 5, 7, 2, 9},
                {9, 5, 8, 2, 4, 7, 3, 6, 1},
                {7, 6, 2, 3, 9, 1, 4, 5, 8},
                {3, 7, 1, 9, 5, 6, 8, 4, 2},
                {4, 9, 6, 1, 8, 2, 5, 7, 3},
                {2, 8, 5, 4, 7, 3, 9, 1, 6}
     */
}
