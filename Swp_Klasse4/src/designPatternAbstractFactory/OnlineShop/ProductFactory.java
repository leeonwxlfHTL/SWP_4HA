package designPatternAbstractFactory.OnlineShop;

public abstract class ProductFactory {

    public static ProductFactory getFactory(ShopType type) {

    if (type == ShopType.Clothing ){
        return new ClothingFactory();
    } else{
        return new ElectronicsFactory();
    }
}

    public abstract Socks createSocks();
    public abstract Clock createClock();
}
