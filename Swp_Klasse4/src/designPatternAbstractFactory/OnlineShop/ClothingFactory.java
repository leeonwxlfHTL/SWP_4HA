package designPatternAbstractFactory.OnlineShop;

public class ClothingFactory extends  ProductFactory{

    @Override
    public Socks  createSocks() {
        return new ClothingSocks();
    }

    @Override
    public Clock createClock() {
        return new ClothingClock();
    }
}
