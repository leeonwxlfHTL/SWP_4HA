package libraryInheritance;

public class Book extends Media{

	private String author;
	
	public Book() {
		super();
	}
	
	

	public Book(String name, int year, double price, String publisher, Genre genre, int ageLimit, int extent,
			String language, String placement, String author) {
		super(name, year, price, publisher, genre, ageLimit, extent, language, placement);
		this.author = author;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "Book: " + this.getName() + " - " + this.author + " | " + this.getYear();
	}
}
