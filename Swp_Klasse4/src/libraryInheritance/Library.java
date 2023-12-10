package libraryInheritance;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Media> media;
	private ArrayList<User> user;
	private ArrayList<Rental> rentals;
	private ArrayList<Reservation> reservations;
	
	public Library() {
		this.media = new ArrayList<Media>();
		this.user = new ArrayList<User>();
		this.rentals = new ArrayList<Rental>();
		this.reservations = new ArrayList<Reservation>();
	}
	
	public ArrayList<Media> getMedia() {
		return media;
	}
	public void setMedia(ArrayList<Media> media) {
		this.media = media;
	}
	public ArrayList<User> getUser() {
		return user;
	}
	public void setUser(ArrayList<User> user) {
		this.user = user;
	}
	public ArrayList<Rental> getRentals() {
		return rentals;
	}
	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void addMedia(Media media) {
		if(!this.media.contains(media)) {
			this.media.add(media);
		}
	}
	
	public void removeMedia(Media media) {
		this.media.remove(media);
	}
	
	public void addUser(User user) {
		if(!this.user.contains(user)) {
			this.user.add(user);
		}
	}
	
	public void removeUser(User user) {
		user.setActive(false);
	}
	
	public void printUser() {
		for(User u : this.user) {
			System.out.println(u);
		}
	}
	
	public void reserveMedia(User user, Media media) {
		if(this.user.contains(user) && this.media.contains(media)) {
			Reservation r = new Reservation(user, media);
			this.reservations.add(r);
		}
	}
	
	
}
