package designPatternAbstractFactory.OnlineShop;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Shop you want to play(1 Electronics, 2 Clothing: ");
        int gameType = sc.nextInt();
        ShopType t;
        if (gameType == 1) {
            System.out.println("You have selected Fantasy Game");
            t = ShopType.Electronics;
        } else {
            System.out.println("You have selected SciFi Game");
            t = ShopType.Clothing;
        }
        System.out.println("Enter the Product you want(1 Socks, 2 Clock: ");
        int gChar = sc.nextInt();


        ProductFactory pF = ProductFactory.getFactory(t);

        if (gChar == 1) {
            Socks s = pF.createSocks();
            s.createSocks();
        } else {
            Clock c = pF.createClock();
            c.createClock();
        }
    }
}
