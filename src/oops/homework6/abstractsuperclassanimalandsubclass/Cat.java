package oops.homework6.abstractsuperclassanimalandsubclass;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	void greets() {
		System.out.println("Meow");
	}
}
