package oops.homework3;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price =price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
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
	
	public String toString() {
		return String.format("Book[name = %$1s, %2$s, price = %5$f, qty = %6$d]", name, author.toString(), price, qty);
	}
}
