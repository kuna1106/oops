package oops.homework5.animal;

public class TestAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal("Lily");
		System.out.println(animal);
		
		Mammal mammal = new Mammal("Jenny");
		System.out.println(mammal);
		
		Cat cat = new Cat("Simon");
		System.out.println(cat);
		cat.greets();
		
		Dog dog = new Dog("Hector");
		System.out.println(dog);
		dog.greets();
		
		Dog dog2 = new Dog("K9");
		System.out.println(dog2);
		dog2.greets(dog2);
	}
}
