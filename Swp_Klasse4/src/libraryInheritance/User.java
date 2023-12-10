package libraryInheritance;

import java.time.LocalDate;
import java.util.UUID;

public class User {
	
	private UUID id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private boolean active;
	
		
	public User(String firstName, String lastName, LocalDate birthDate) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.active = true;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public String toString() {
		return this.firstName + " " + this.lastName + " | " + this.birthDate + " | " + this.active;
	}
	

}
