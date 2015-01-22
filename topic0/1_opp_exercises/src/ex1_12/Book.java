package ex1_12;

import java.util.ArrayList;

import ex1_2.Author;

public class Book {
	
	private ArrayList<Author> authors = new ArrayList<Author>();
	
 	private int numAuthors = 0;
	
	private String name;
	private double price;
	private int qtyInStock = 0;
	
	public Book (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Book (String name, double price, 
	     int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	public void printAuthors() {
		for(int i=0;i<authors.size();i++){
		    System.out.println(authors.get(i));
		} 
	}
	
	public String toString() {
		return name + " by " + numAuthors + " authors";
	}
	
	 public void addAuthor(Author author) {
	     authors.add(author);
	     ++numAuthors;
	   }
	
}