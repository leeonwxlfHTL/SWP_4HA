package conwaysGameOfLife;

public class Output {

    /**
     * Displays the current state of the game board.
     * A cell with value 1 is represented as " # " while an empty cell is represented as "   ".
     *
     * @param array The 2D array representing the game board.
     */
    public void display(int[][] array, int lifeCycles) {
        System.out.println("-------------------------------------------------");
        System.out.println("LifeCycles: " + lifeCycles);
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] == 1) {
                    System.out.print(" # ") ;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}
