package abstractFactoryPattern;

public class AntiqueFurnitureFactory extends FurnitureFactory {

	public Chair createChair() {
		return new AntiqueChair();
	}

	public Table createTable() {
		return new AntiqueTable();
	}

}
