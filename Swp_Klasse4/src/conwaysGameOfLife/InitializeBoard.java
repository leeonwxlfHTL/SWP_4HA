package conwaysGameOfLife;

public class InitializeBoard {
    int[][] board; //Game Board

    /**
     * Constructor to create a game board with the specified dimensions.
     *
     * @param size_X Number of rows in the game board.
     * @param size_Y Number of columns in the gam
     */
    public InitializeBoard(int size_X, int size_Y){
        board = new int[size_X][size_Y];
    }

    /**
     * Initializes the game board with random values (0 or 1).
     * Each cell has a 50% chance of being alive (1) or dead (0).
     *
     * @return The initialized game board as a two-dimensional array.
     */
    public int[][] initGameBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(Math.random() > 0.5){
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
        return board;

    }

}
