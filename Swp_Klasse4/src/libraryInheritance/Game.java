package libraryInheritance;

public class Game extends Media{

	private int noOfPlayers;
	private String description;
	
	public Game() {
		super();
	}
	
	public Game(String name, int year, double price, String publisher, Genre genre, int ageLimit, int extent,
			String language, String placement, int noOfPlayers, String description) {
		super(name, year, price, publisher, genre, ageLimit, extent, language, placement);
		this.noOfPlayers = noOfPlayers;
		this.description = description;
	}



	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Game: " + this.getName() + " - Players: " + this.noOfPlayers + " | " + this.getYear();
	}
	
}
