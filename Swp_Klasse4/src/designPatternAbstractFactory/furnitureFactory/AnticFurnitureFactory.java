package designPatternAbstractFactory.furnitureFactory;

public class AnticFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new AnticChair();
    }

    @Override
    public Desk createDesk() {
        return new AnticDesk();
    }
}
