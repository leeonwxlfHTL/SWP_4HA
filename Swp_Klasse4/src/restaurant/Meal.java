package restaurant;

import java.util.ArrayList;

public class Meal {
	
	private int id;
	private String name;
	private String description;
	private ArrayList<Character> allergens;
	private double price;
	private boolean vegan;
	private boolean kidServing;
	
	/**
	 * Constructor of class Meal
	 * 
	 * @param id - consecutive number
	 * @param name - short name
	 * @param description - description of the meal
	 * @param price - total price
	 * @param vegan - is the meal vegan or not
	 */
	public Meal(int id, String name, String description, double price, boolean vegan) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegan = vegan; 
		this.kidServing = false;
		this.allergens = new ArrayList<Character>();
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
	public ArrayList<Character> getAllergens() {
		return allergens;
	}
	public void setAllergens(ArrayList<Character> allergens) {
		this.allergens = allergens;
	}
	public double getPrice() {
		if(this.kidServing) {
			return Math.round(this.price * 0.7 * 100) / 100;
		}
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isVegan() {
		return vegan;
	}
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	public boolean isKidServing() {
		return kidServing;
	}
	public void setKidServing(boolean kidServing) {
		this.kidServing = kidServing;
	}
	
	/**
	 * Method adds allergen to the allergens list of the meal
	 * 
	 * @param allergen - allergen to be added
	 */
	public void addAllergen(char allergen) {
		if(!this.allergens.contains(allergen)){
			this.allergens.add(allergen);
		}
	}
	
	public String toString() {
		return this.id + ": " + this.name + " - € " + getPrice();
	}
	
	/**
	 * Meals are equal when name, description, portion size and vegan ist
	 * similar.
	 * 
	 * @param meal - to be compared to
	 * @return true, if similar otherwise false
	 */
	public boolean equals(Meal meal) {
		if(this.name.equals(meal.getName())
				&& this.description.equals(meal.getDescription())
				&& this.kidServing == meal.isKidServing()
				&& this.vegan == meal.isVegan()) {
			return true;
		}
		return false;
	}

}
