package restaurant;

import java.util.ArrayList;
import java.util.Collections;

public class Restaurant {
	
	private ArrayList<Order> orders;
	
	public Restaurant() {
		this.orders = new ArrayList<Order>();
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	/**
	 * Method adds order to the restaurant
	 * 
	 * @param order - order to be added
	 */
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	/**
	 * Method removes order from restaurant
	 * 
	 * @param order - to be removed (first occurence)
	 */
	public void removeOrder(Order order) {
		this.orders.remove(order);
	}
	
	/**
	 * Method calculates the total revenue of the restaurant
	 * 
	 * @return total revenue of all orders
	 */
	public double calculateTotalRevenue() {
		double sumTotal = 0;
		for(Order o : this.orders) {
			sumTotal += o.calculateTotalPrice();
		}
		return sumTotal;
	}
	
	/**
	 * Method generates the total revenue of all
	 * orders payed with credit card. The order
	 * details are printed to console
	 * 
	 * @return - the total revenue
	 */
	public double getTaxOfficeReport() {
		double sumTotal = 0;
		for(Order o : this.orders) {
			if(o.isCardPayment()) {
				sumTotal += o.calculateTotalPrice();
				System.out.println(o);
			}
		}
		return sumTotal;
	}
	
	/**
	 * Methods generates a distinct list with all
	 * drinks in orders (single occurence of each
	 * drink).
	 * 
	 * @return ArrayList with distinct drinks
	 */
	private ArrayList<Drink> getDistinctDrinkList(){
		ArrayList<Drink> tmp = new ArrayList<Drink>();
		for(Order o : this.orders) {
			for(Drink d : o.getDrinks()) {
				if(!tmp.contains(d)) {
					tmp.add(d);
				}
			}
		}
		return tmp;
	}
	
	/**
	 * Methods generates a distinct list with all
	 * meals in orders (single occurence of each
	 * meal).
	 * 
	 * @return ArrayList with distinct meals
	 */
	private ArrayList<Meal> getDistinctMealList(){
		ArrayList<Meal> tmp = new ArrayList<Meal>();
		for(Order o : this.orders) {
			for(Meal m : o.getMeals()) {
				if(!tmp.contains(m)) {
					tmp.add(m);
				}
			}
		}
		return tmp;
	}
	
	/**
	 * Method calculates total amount of each meal and drink
	 * and prints it to the console.
	 */
	public void getDailyReport() {
		ArrayList<Drink> drinkList = this.getDistinctDrinkList();
		ArrayList<Meal> mealList = this.getDistinctMealList();
		int tmp = 0;
		System.out.println("Anzahl | ID: Name - Preis");
		for(Drink d : drinkList) {
			for(Order o : this.orders) {
				tmp += Collections.frequency(o.getDrinks(), d);
			}
			System.out.println(tmp + " | " + d);
			tmp = 0;
		}
		for(Meal m : mealList) {
			for(Order o : this.orders) {
				tmp += Collections.frequency(o.getMeals(), m);
			}
			System.out.println(tmp + " | " + m);
			tmp = 0;
		}
	}
	
	/**
	 * Method calculates total amount of vegan dishes
	 * and prints a detailed view to the console.
	 * @return
	 */
	public int getAmountOfVeganDishes() {
		ArrayList<Meal> meals = this.getDistinctMealList();
		for(Meal m : meals) {
			if(!m.isVegan()) {
				meals.remove(m);
			}
		}
		int totalSum = 0;
		int tmp = 0;
		for(Meal m : meals) {
			for(Order o : this.orders) {
				tmp += Collections.frequency(o.getMeals(), m);
			}
			System.out.println(tmp + " | " + m);
			totalSum += tmp;
			tmp = 0;
		}
		return totalSum;
	}
	
	public String toString() {
		String tmp = "";
		for(Order o : this.orders) {
			tmp += o.getId() + " - closed: " + o.isClosed() + " - total: " + o.calculateTotalPrice() + "\n";
		}
		return tmp;
	}

}
