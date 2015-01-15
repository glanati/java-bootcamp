package ex1_11;

import ex1_2.Author;

public class TestBook {
	public static void main(String[] args) {
		
		// Declare and allocate an array of Authors
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
		 
		// Declare and allocate a Book instance
		Book javaDummy = new Book("Java for Dummy", 19.99, 99, authors);
		System.out.println(javaDummy);  // toString()
		System.out.println("The authors are: ");
		javaDummy.printAuthors();
	}

}
