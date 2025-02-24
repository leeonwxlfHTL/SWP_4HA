package designPatternAbstractFactory.furnitureFactory;

public class ModernFurnitureFactory extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Desk createDesk() {
        return new ModernDesk();
    }
}
