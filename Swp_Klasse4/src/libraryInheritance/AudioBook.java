package libraryInheritance;

public class AudioBook extends Media{

	private String voice;
	private String description;
	private boolean bookAvailable;
	
	public AudioBook() {
		super();
	}
	
	
	public AudioBook(String name, int year, double price, String publisher, Genre genre, int ageLimit, int extent,
			String language, String placement, String voice, String description, boolean bookAvailable) {
		super(name, year, price, publisher, genre, ageLimit, extent, language, placement);
		this.voice = voice;
		this.description = description;
		this.bookAvailable = bookAvailable;
	}


	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isBookAvailable() {
		return bookAvailable;
	}
	public void setBookAvailable(boolean bookAvailable) {
		this.bookAvailable = bookAvailable;
	}
	
	public String toString() {
		return "AudioBook: " + this.getName() + " - " + this.voice + " | " + this.getYear();
	}
}
