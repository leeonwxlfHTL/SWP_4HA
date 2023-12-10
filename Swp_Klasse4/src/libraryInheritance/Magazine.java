package libraryInheritance;

import java.util.ArrayList;

public class Magazine extends Media{

	private ArrayList<String> authors;
	
	public Magazine() {
		super();
	}
	

	public Magazine(String name, int year, double price, String publisher, Genre genre, int ageLimit, int extent,
			String language, String placement, String... authors) {
		super(name, year, price, publisher, genre, ageLimit, extent, language, placement);
		this.authors = new ArrayList<String>();
		if(authors != null) {
			this.authors.addAll(java.util.Arrays.asList(authors));
		}
	}


	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public String toString() {
		return "Magazine: " + this.getName() + " | " + this.getYear();
	}
	
}
