package libraryInheritance;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		// Create 5 Book objects
        Book book1 = new Book("The Great Gatsby", 1925, 19.99, "Scribner", Genre.CLASSICS, 16, 250, "English", "A1", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", 1960, 15.50, "J. B. Lippincott & Co.", Genre.CLASSICS, 15, 320, "English", "B3", "Harper Lee");
        Book book3 = new Book("1984", 1949, 12.25, "Secker & Warburg", Genre.SCIENCE_FICTION, 17, 280, "English", "C5", "George Orwell");
        Book book4 = new Book("The Catcher in the Rye", 1951, 14.75, "Little, Brown and Company", Genre.DRAMA, 16, 200, "English", "D2", "J.D. Salinger");
        Book book5 = new Book("Pride and Prejudice", 1813, 10.00, "T. Egerton, Whitehall", Genre.ROMANCE, 14, 300, "English", "E7", "Jane Austen");
        
        // Create 5 Movie objects
        Movie movie1 = new Movie("Inception", 2010, 12.99, "Warner Bros.", Genre.SCIENCE_FICTION, 13, 150, "English", "A1", "Christopher Nolan", "Mind-bending thriller", "Leonardo DiCaprio", "Ellen Page", "Tom Hanks");
        Movie movie2 = new Movie("The Shawshank Redemption", 1994, 9.99, "Columbia Pictures", Genre.DRAMA, 17, 142, "English", "B3", "Frank Darabont", "Inspirational drama", "Tim Robbins", "Morgan Freeman");
        Movie movie3 = new Movie("The Dark Knight", 2008, 14.50, "Warner Bros.", Genre.ACTION_AND_ADVENTURE, 15, 152, "English", "C5", "Christopher Nolan", "Action-packed superhero film", "Christian Bale", "Heath Ledger");
        Movie movie4 = new Movie("The Godfather", 1972, 11.75, "Paramount Pictures", Genre.CRIME, 18, 175, "English", "D2", "Francis Ford Coppola", "Classic crime drama", "Marlon Brando", "Al Pacino");
        Movie movie5 = new Movie("Forrest Gump", 1994, 10.00, "Paramount Pictures", Genre.DRAMA, 12, 142, "English", "E7", "Robert Zemeckis", "Heartwarming tale","Tom Hanks", "Robin Wright");
        // movie without actors
        Movie movie6 = new Movie("Bee Movie", 2012, 10.00, "Pixar", Genre.CHILDREN,0,120,"Deutsch", "D4", "Regisseur","Movie with bees");
        
        // Create 5 Magazine objects
        Magazine magazine1 = new Magazine("National Geographic", 1888, 5.99, "National Geographic Society", Genre.SCIENCE_FICTION, 0, 100, "English", "A1", "Various Authors");
        Magazine magazine2 = new Magazine("Time", 1923, 4.99, "Time USA, LLC", Genre.NEWS, 0, 80, "English", "B3", "Various Authors");
        Magazine magazine3 = new Magazine("Vogue", 1892, 6.99, "Condé Nast", Genre.FASHION, 0, 120, "English", "C5", "Various Authors");
        Magazine magazine4 = new Magazine("Wired", 1993, 3.99, "Condé Nast", Genre.TECHNOLOGY, 0, 90, "English", "D2", "Various Authors");
        Magazine magazine5 = new Magazine("The Economist", 1843, 7.99, "The Economist Group", Genre.ECONOMICS, 0, 70, "English", "E7", "Various Authors");
        
        // Create 10 User objects (Random data for demonstration)
        User user1 = new User("John", "Doe", LocalDate.of(1990, 5, 15));
        User user2 = new User("Alice", "Smith", LocalDate.of(1985, 9, 22));
        User user3 = new User("Bob", "Johnson", LocalDate.of(1995, 3, 8));
        User user4 = new User("Emily", "Williams", LocalDate.of(1982, 12, 10));
        User user5 = new User("Michael", "Brown", LocalDate.of(1988, 7, 4));
        User user6 = new User("Sophia", "Jones", LocalDate.of(1992, 11, 18));
        User user7 = new User("David", "Davis", LocalDate.of(1980, 6, 25));
        User user8 = new User("Emma", "Garcia", LocalDate.of(1998, 4, 30));
        User user9 = new User("James", "Martinez", LocalDate.of(1987, 2, 14));
        User user10 = new User("Olivia", "Lee", LocalDate.of(1993, 10, 7));
        
        // Create 5 Reservation objects (Assuming user1 has made reservations)
        Reservation reservation1 = new Reservation(user1, book1);
        Reservation reservation2 = new Reservation(user1, movie1);
        Reservation reservation3 = new Reservation(user1, magazine1);
        Reservation reservation4 = new Reservation(user1, book2);
        Reservation reservation5 = new Reservation(user1, movie2);
        
        // Create 5 Rental objects (Assuming user1 has rented items)
        Rental rental1 = new Rental(user1, book3, LocalDate.of(2023, 11, 12));
        Rental rental2 = new Rental(user1, movie3, LocalDate.of(2023, 11, 12));
        Rental rental3 = new Rental(user1, magazine2, LocalDate.of(2023, 11, 12));
        Rental rental4 = new Rental(user1, book4, LocalDate.of(2023, 11, 12));
        Rental rental5 = new Rental(user1, movie4, LocalDate.of(2023, 11, 12));

        Library library1 = new Library();
        library1.addUser(user1);
        library1.addUser(user2);
        library1.addUser(user3);
        library1.addUser(user4);
        library1.addUser(user5);
        library1.addUser(user7);
        library1.addUser(user8);
        library1.addUser(user8);
        library1.addUser(user9);
        library1.addUser(user10);
        
        library1.printUser();
        library1.removeUser(user3);
        System.out.println();
        library1.printUser();
	}

}
