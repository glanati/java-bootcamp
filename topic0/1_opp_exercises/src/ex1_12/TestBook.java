package ex1_12;

import ex1_2.Author;

public class TestBook {
	public static void main(String[] args) {
		// Test program
		Book javaDummy = new Book("Java for Dummy", 19.99, 99);
		System.out.println(javaDummy);  // toString()
		System.out.println("The authors are: ");
		javaDummy.printAuthors();
		 
		System.out.println();
		
		javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
		javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
		System.out.println(javaDummy);  // toString()
		System.out.println("The authors are: ");
		javaDummy.printAuthors();
	}

}
