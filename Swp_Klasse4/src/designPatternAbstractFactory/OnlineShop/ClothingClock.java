package designPatternAbstractFactory.OnlineShop;

public class ClothingClock extends Clock{
    @Override
    public void createClock() {
        System.out.println("Clothing Clock created");
        System.out.println("Looks expensive");
    }
}
