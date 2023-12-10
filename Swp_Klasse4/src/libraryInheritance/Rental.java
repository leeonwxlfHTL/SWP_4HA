package libraryInheritance;

import java.time.LocalDate;

public class Rental {
	
	private User user;
	private Media media;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean isBorrowed;
	
	public Rental(User user, Media media, LocalDate startDate) {
		this.user = user;
		this.media = media;
		this.startDate = startDate;
		this.endDate = this.startDate.plusWeeks(5);
		this.isBorrowed = true;
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	
	public String toString() {
		return "Rental: \n\t User: " + this.user + "\n\t Media: " + this.media + "\n\t | " + this.startDate + "-  " + this.endDate; 
	}
	

}
