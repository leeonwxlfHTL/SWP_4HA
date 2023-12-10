package libraryInheritance;

import java.util.ArrayList;

public class Movie extends Media{

	private String regisseur;
	private String description;
	private ArrayList<String> actors;
	
	public Movie() {
		super();
	}
	
	
	
	public Movie(String name, int year, double price, String publisher, Genre genre, int ageLimit, int extent,
			String language, String placement, String regisseur, String description, String... actors) {
		super(name, year, price, publisher, genre, ageLimit, extent, language, placement);
		this.regisseur = regisseur;
		this.description = description;
		this.actors = new ArrayList<String>();
		if(actors != null) {
			this.actors.addAll(java.util.Arrays.asList(actors));
		}
	}



	public String getRegisseur() {
		return regisseur;
	}
	public void setRegisseur(String regisseur) {
		this.regisseur = regisseur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getActors() {
		return actors;
	}
	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}
	
	public String toString() {
		return "Movie: " + this.getName() + " - " + this.regisseur + " | " + this.getYear();
	}
	
}
