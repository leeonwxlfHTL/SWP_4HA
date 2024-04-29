package abstractFactoryPattern;

public abstract class FurnitureFactory {

	public static FurnitureFactory getFactory(FurnitureType type) {
		if(type == FurnitureType.MODERN) {
			return new ModernFurnitureFactory();
		} else {
			return new AntiqueFurnitureFactory();
		}
	}
	
	public abstract Chair createChair();
	public abstract Table createTable();
	
}
