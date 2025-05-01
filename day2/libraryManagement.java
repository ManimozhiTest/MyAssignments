package Week1.day2;

public class libraryManagement {

	// Main Method to call the methods of Library Class
	public static void main(String[] args) {
		// Creating Object of Library class
		library library = new library();
		// Calling Methods of Library class
		// method addBook called
		System.out.println(library.addBook("Book added successfully"));
		// Method issue book called
		library.issueBook();

	}

}
