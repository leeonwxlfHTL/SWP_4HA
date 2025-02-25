package designPatternAbstractFactory.OnlineShop;

public class ClothingSocks extends  Socks{
    @Override
    public void createSocks() {
        System.out.println("Clothing Socks created");
        System.out.println("Match the outfit");
    }
}
