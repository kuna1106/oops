package oops.homework6.abstractsuperclassanimalandsubclass;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract void greets();
}
