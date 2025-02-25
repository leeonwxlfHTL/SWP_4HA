package designPatternAbstractFactory.OnlineShop;

public class ElectronicSocks extends Socks{
    @Override
    public void createSocks() {
        System.out.println("Electronic Socks created");
        System.out.println("Heated Socks");
    }
}
