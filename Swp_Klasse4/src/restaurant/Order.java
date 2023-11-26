package restaurant;

import java.util.ArrayList;

public class Order {
	
	private int id;
	private int tableNumber;
	private ArrayList<Meal> meals;
	private ArrayList<Drink> drinks;
	private boolean closed;
	private boolean cardPayment;
	
	/**
	 * Constructor of class Order
	 * 
	 * @param id - consecutive number
	 * @param tableNumber - number of the table in the restaurant
	 */
	public Order(int id, int tableNumber) {
		this.id = id;
		this.tableNumber = tableNumber;
		this.closed = false;
		this.cardPayment = false;
		this.meals = new ArrayList<Meal>();
		this.drinks = new ArrayList<Drink>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public ArrayList<Meal> getMeals() {
		return meals;
	}
	public void setMeals(ArrayList<Meal> meals) {
		this.meals = meals;
	}
	public ArrayList<Drink> getDrinks() {
		return drinks;
	}
	public void setDrinks(ArrayList<Drink> drinks) {
		this.drinks = drinks;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public boolean isCardPayment() {
		return cardPayment;
	}
	public void setCardPayment(boolean cardPayment) {
		this.cardPayment = cardPayment;
	}
	
	/**
	 * Method adds meal to the order
	 * 
	 * @param meal - to be added
	 */
	public void addMeal(Meal meal) {
		this.meals.add(meal);
	}
	
	/**
	 * Method adds drink to the order
	 * 
	 * @param drink - to be added
	 */
	public void addDrink(Drink drink) {
		this.drinks.add(drink);
	} 
	
	/**
	 * Method removes meal from the order
	 * 
	 * @param meal - to be removed (first occurence)
	 */
	public void removeMeal(Meal meal) {
		this.meals.remove(meal);
	}
	
	/**
	 * Method removes drink from the order
	 * 
	 * @param drink - to be removed (first occurence)
	 */
	public void removeDrink(Drink drink) {
		this.drinks.remove(drink);
	}
	
	/**
	 * Method calculates total price of order
	 * 
	 * @return - total price of order
	 */
	public double calculateTotalPrice() {
		double totalSum = 0;
		for(Meal m : this.meals) {
			totalSum += m.getPrice();
		}
		for(Drink d : this.drinks) {
			totalSum += d.getPrice();
		}
		return totalSum;
	}
	
	/**
	 * Methods closes order after payment.
	 * 
	 * @param cardPayment - true, if guest payed with credit card
	 */
	public void closeOrder(boolean cardPayment) {
		this.cardPayment = cardPayment;
		this.closed = true;
	}
	
	public String toString() {
		String tmp = this.id + ": T-Nr. " + this.tableNumber + " - Status: " + this.closed + "\n";
		for(Meal m : this.meals) {
			tmp += "\t" + m + "\n";
		}
		for(Drink d : this.drinks) {
			tmp += "\t" + d + "\n";
		}
		tmp += "\n Gesamtsumme:" + this.calculateTotalPrice();
		tmp += "\n Kartenzahlung: " + this.cardPayment;
		return tmp;
	}
	
	

}
