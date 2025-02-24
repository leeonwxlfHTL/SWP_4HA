package designPatternAbstractFactory;

public abstract class FurnitureFactory {

    public static FurnitureFactory getFactory(FurnitureType type){
        if(type == FurnitureType.MODERN) {
            return new ModernFurnitureFactory();
        }else{
            return new AnticFurnitureFactory();
        }
    }

    public abstract Chair createChair();
    public abstract Desk createDesk();

}
