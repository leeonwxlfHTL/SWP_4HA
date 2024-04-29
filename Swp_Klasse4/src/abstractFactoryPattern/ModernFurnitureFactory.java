package abstractFactoryPattern;

public class ModernFurnitureFactory extends FurnitureFactory {

	public Chair createChair() {
		return new ModernChair();
	}

	public Table createTable() {
		return new ModernTable();
	}

}
