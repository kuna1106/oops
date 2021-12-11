package oops.homework6.abstractsuperclassanimalandsubclass;

public class TestDriver {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom");
        cat.greets();

        System.out.println();
        Dog zero = new Dog("K9");
        Dog dog = new Dog("Rex");
        dog.greets();
        dog.greets(zero);

        System.out.println();
        BigDog zeroBigDog = new BigDog("Atlas");
        BigDog bigDog = new BigDog("Zeus");
        bigDog.greets();
        bigDog.greets(zero);
        bigDog.greets(zeroBigDog);
	}
}
