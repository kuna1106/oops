package vn.hus.homeworkpart31;

import java.util.Arrays;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] author, double price) {
		this.name = name;
		this.author = author;
		this.price =price;
	}
	
	public Book(String name, Author[] author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getAuthorNames() {
		StringBuilder authors2 = new StringBuilder();
		String comma = ",";
		
		for (Author author : author) {
			authors2.append(author.getName()).append(comma);
		}
		return authors2.toString();
	}
	
	public String toString() {
		return "Book[name=" + name + "authors= {" + Arrays.toString(author)+ "], Price" + price + ", qty = " + qty + "]";
	}
}

