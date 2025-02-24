package designPatternAbstractFactory;

public class FurnitureHouse {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        furnitureFactory.createChair().build();
        furnitureFactory.createDesk().build();

        FurnitureFactory furnitureFactory2 = new AnticFurnitureFactory();
        furnitureFactory2.createChair().build();
        furnitureFactory2.createDesk().build();

        FurnitureFactory furnitureFactory3 = FurnitureFactory.getFactory(FurnitureType.MODERN);
        furnitureFactory3.createChair().build();
        furnitureFactory3.createDesk().build();
    }
}
