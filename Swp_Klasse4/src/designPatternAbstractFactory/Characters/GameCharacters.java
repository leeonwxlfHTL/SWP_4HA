package designPatternAbstractFactory.Characters;

import java.util.Scanner;

public class GameCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Game you want to play(1 Fantasy, 2 SciFi: ");
        int gameType = sc.nextInt();
        GameType t;
        if (gameType == 1) {
            System.out.println("You have selected Fantasy Game");
            t = GameType.FANTASY;
        } else {
            System.out.println("You have selected SciFi Game");
            t = GameType.SCI_FI;
        }
        System.out.println("Enter the type of Character you want to create(1 Worrier, 2 Magician: ");
        int gChar = sc.nextInt();


        CharacterFactory cF = CharacterFactory.getFactory(t);

        if (gChar == 1) {
            Worrier w = cF.createWorrier();
            w.create();
        } else {
            Magician m = cF.createMagician();
            m.create();
        }
    }
}
