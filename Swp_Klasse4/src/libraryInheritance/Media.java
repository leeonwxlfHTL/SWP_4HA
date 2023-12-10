package libraryInheritance;

import java.util.UUID;

public class Media {

	private UUID id;
	private String name;
	private int year;
	private double price;
	private String publisher;
	private Genre genre;
	private int ageLimit;
	private int extent;
	private String language;
	private String placement;
	
	public Media() {}
	
	public Media(String name, int year, double price, String publisher, Genre genre, int ageLimit, int extent,
			String language, String placement) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.year = year;
		this.price = price;
		this.publisher = publisher;
		this.genre = genre;
		this.ageLimit = ageLimit;
		this.extent = extent;
		this.language = language;
		this.placement = placement;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public String getPlacement() {
		return placement;
	}
	public void setPlacement(String placement) {
		this.placement = placement;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public int getExtent() {
		return extent;
	}
	public void setExtent(int extent) {
		this.extent = extent;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String toString() {
		return this.name + " " + this.year;
	}
	
}
