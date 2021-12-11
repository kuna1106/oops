package oops.homeworkpart31;

public class Customer {
	private int ID;
	private String name;
	private char gender;

	public Customer(int ID, String name, char gender) {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return String.format("%1$s(%2$d)", name, ID);
	}
}
