package conwaysGameOfLife;

import java.util.Scanner;


public class GameHandler {
    public static void main(String[] args) throws InterruptedException {

        int lifeCycles = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie eine Zeilen Anzahl an: (mindestens 10)");
        int x = sc.nextInt();
        System.out.println("Geben sie eine Spalten Anzahl an: (mindestens 10)");
        int y = sc.nextInt();

        InitializeBoard board = new InitializeBoard(x, y);
        int[][] gameBoard = board.initGameBoard();

        Output output = new Output();
        output.display(gameBoard, lifeCycles);

        GameMachanic gameMachanic = new GameMachanic();
        CheckBoard cb = new CheckBoard();

        while(true){

            lifeCycles++;

            int[][] gb = gameBoard;

            gameBoard = gameMachanic.calculateNewStage(gameBoard);
            output.display(gameBoard, lifeCycles);

            Thread.sleep(1100);

            if(cb.isEqual(gameBoard,gb)) {
                System.err.println("Das Brett hat sich nicht mehr verändert");
                break;
            }


        }
    }
}
