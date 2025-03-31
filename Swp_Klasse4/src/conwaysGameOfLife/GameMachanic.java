package conwaysGameOfLife;

public class GameMachanic {
    int[][] thatGameBoard;


    /**
     * Calculates the next stage of the game board based on the rules of Conway's Game of Life.
     * Each cell follows these rules:
     * - A live cell with fewer than two live neighbors dies (underpopulation).
     * - A live cell with two or three live neighbors survives.
     * - A live cell with more than three live neighbors dies (overpopulation).
     * - A dead cell with exactly three live neighbors becomes alive (reproduction).
     *
     * @param gameBoard The current state of the game board.
     * @return The new state of the game board.
     */
    public int[][] calculateNewStage(int [][] gameBoard) {
        int[][] newBoard;
        newBoard = new int[gameBoard.length][gameBoard[0].length];
        this.thatGameBoard = gameBoard;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                int neighbours = countNeighbours(i, j);
                if(thatGameBoard[i][j] == 1){
                    if (neighbours> 3 || neighbours < 2) {
                        newBoard[i][j] = 0;
                    } else if (neighbours == 3 || neighbours == 2) {
                        newBoard[i][j] = 1;
                    }
                } else {
                    if (neighbours == 3) {
                        newBoard[i][j] = 1;
                    } else {
                        newBoard[i][j] = 0;
                    }
                }
            }
        }
                return newBoard;
    }

    /**
     * Counts the number of live neighbors around a given cell.
     * It considers all eight possible neighbors and ensures that index boundaries are not exceeded.
     *
     * @param i The row index of the cell.
     * @param j The column index of the cell.
     * @return The number of live neighbors.
     */
    private int countNeighbours(int i, int j) {
        int neighbours = 0;

        if (i == 0 && j == 0) {
            neighbours += thatGameBoard[i + 1][j];
            neighbours += thatGameBoard[i][j + 1];
            neighbours += thatGameBoard[i + 1][j + 1];
        } else if (i == 0 && j >= 1 && j < thatGameBoard[0].length - 1) {
            neighbours += thatGameBoard[i][j - 1];
            neighbours += thatGameBoard[i + 1][j - 1];
            neighbours += thatGameBoard[i + 1][j];
            neighbours += thatGameBoard[i + 1][j + 1];
            neighbours += thatGameBoard[i][j + 1];
        } else if (i >= 1 && j == 0   && i < thatGameBoard.length - 1) {
            neighbours += thatGameBoard[i - 1][j];
            neighbours += thatGameBoard[i - 1][j + 1];
            neighbours += thatGameBoard[i][j + 1];
            neighbours += thatGameBoard[i + 1][j + 1];
            neighbours += thatGameBoard[i + 1][j];
        } else if (i >= 1 && j >= 1  && j < thatGameBoard[0].length - 1 && i < thatGameBoard.length - 1) {
            neighbours += thatGameBoard[i - 1][j - 1];
            neighbours += thatGameBoard[i - 1][j];
            neighbours += thatGameBoard[i - 1][j + 1];
            neighbours += thatGameBoard[i][j + 1];
            neighbours += thatGameBoard[i + 1][j + 1];
            neighbours += thatGameBoard[i + 1][j];
            neighbours += thatGameBoard[i + 1][j - 1];
            neighbours += thatGameBoard[i][j - 1];

        } else if (i >= 1  && j == thatGameBoard[0].length && i < thatGameBoard.length - 1) {
            neighbours += thatGameBoard[i - 1][j - 1];
            neighbours += thatGameBoard[i - 1][j];
            neighbours += thatGameBoard[i + 1][j];
            neighbours += thatGameBoard[i + 1][j - 1];
            neighbours += thatGameBoard[i][j - 1];
        } else if (j >= 1  && j < thatGameBoard[0].length - 1 && i == thatGameBoard.length) {
            neighbours += thatGameBoard[i - 1][j - 1];
            neighbours += thatGameBoard[i - 1][j];
            neighbours += thatGameBoard[i - 1][j + 1];
            neighbours += thatGameBoard[i][j + 1];
            neighbours += thatGameBoard[i][j - 1];
        }
        return neighbours;
    }

}
