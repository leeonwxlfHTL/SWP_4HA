package abstractFactoryPattern;

public class FurnitureStore {

	private FurnitureFactory factory;
	
	public FurnitureStore(FurnitureFactory factory) {
		this.factory = factory;
	}
	
	public FurnitureStore(FurnitureType type) {
		this.factory = FurnitureFactory.getFactory(type);
	}
	
	public void orderFurniture() {
		Chair chair = factory.createChair();
		Table table = factory.createTable();
		chair.orderItem();
		table.orderItem();
	}
	
	public FurnitureFactory getFactory() {
		return factory;
	}

	public void setFactory(FurnitureFactory factory) {
		this.factory = factory;
	}

	public static void main(String[] args) {
		FurnitureStore modernFactory = new FurnitureStore(FurnitureType.MODERN);
		modernFactory.orderFurniture();
		
		FurnitureFactory factory = FurnitureFactory.getFactory(FurnitureType.ANTIQUE);
		Chair chair = factory.createChair();
		chair.orderItem();
		
	}

}
