package restaurant;

public class Drink {

	private int id;
	private String name;
	private String description;
	private double price;
	private double size;
	private boolean alcoholic;
	
	/**
	 * Constructor of class Drink
	 * 
	 * @param id - consecutive number
	 * @param name - short name
	 * @param description - description of the drink
	 * @param price - price for standard size
	 * @param size - size 0.5 or 0.25
	 * @param alcoholic - contains the drink alcohol
	 */
	public Drink(int id, String name, String description, double price, double size, boolean alcoholic) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
		this.alcoholic = alcoholic;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		if(this.size != 0.5) {
			return ((int)(this.price * 0.7 * 100)) / 100;
		}
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public boolean isAlcoholic() {
		return alcoholic;
	}
	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}
	
	public String toString() {
		return this.id + ": " + this.name + " - € " + getPrice();
	}
	
	/**
	 * Drinks are equal when name, description and size are
	 * similar.
	 * 
	 * @param drink - to be compared to
	 * @return true, if similar otherwise false
	 */
	public boolean equals(Drink drink) {
		if(this.name.equals(drink.getName() )
				&& this.description.equals(drink.getDescription())
				&& this.size == drink.getSize()) {
			return true;
		}
		return false;
	}
	
	
}
