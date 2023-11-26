package restaurant;

public class Test {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		Meal m1 = new Meal(1, "Schnitzel", "Schnitzel Wiener Art mit Pommes", 18.50, false);
		m1.addAllergen('C');
		m1.addAllergen('A');
		Meal m2 = new Meal(2, "Zwiebelrostbraten", "Zwiebelrostbraten mit Butterspätzle", 23.80, false);
		m2.addAllergen('C');
		m2.addAllergen('A');
		Meal m3 = new Meal(3, "Käsespätzle", "Käsespätzle mit Röstzwiebeln", 15.90, false);
		m3.addAllergen('C');
		m3.addAllergen('G');
		m2.addAllergen('A');
		Meal m4 = new Meal(4, "Karfiol", "Karfiol mit veganem Dip", 16.10, true);
		Drink d1 = new Drink(1, "Almdudler", "Almdudler", 4.50, 0.5, false);
		Drink d2 = new Drink(2, "Eiskaffee", "Eiskaffee mit Vanilleeis und Sahne", 7.30, 0.25, false);
		Drink d3 = new Drink(3, "Bier", "Vilser Bergbräu", 4.60, 0.5, true);
		Order o1 = new Order(1, 12);
		o1.addDrink(d1);
		o1.addDrink(d3);
		o1.addDrink(d3);
		o1.addMeal(m4);
		Order o2 = new Order(2, 25);
		o2.addDrink(d1);
		o2.addDrink(d2);
		restaurant.addOrder(o1);
		restaurant.addOrder(o2);
		System.out.println(o1);
		o1.removeDrink(d3);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(restaurant);
		restaurant.getDailyReport();
		int sum = restaurant.getAmountOfVeganDishes();
		System.out.println(sum);
	}

}
