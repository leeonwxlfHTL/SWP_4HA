package libraryInheritance;

public class Reservation {
	
	private User user;
	private Media media;
	private boolean isReserved;
	
	public Reservation(User user, Media media) {
		this.user = user;
		this.media = media;
		this.isReserved = true;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	
	
	public String toString() {
		return "Reservation: \n\t User: " + this.user + "\n\t Medium: " + this.media + "\n\t Status: " + this.isReserved; 
	}

}
