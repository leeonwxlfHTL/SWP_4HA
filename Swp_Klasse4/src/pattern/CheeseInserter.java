package pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Tomaten?|Zwiebeln?|Gurken?"
			);
	
	public static List<String> insertCheeseAroundVegetable(List<String> ingredients) {
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			String ingredient = iterator.next();
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
				
			}
		}
		return ingredients;
	}
			
	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprikas", "Pfeffer", "Gurke");
		ingredients = insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
	}

}
