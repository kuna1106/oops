package oops.homework6.abstractsuperclassanimalandanotherview;

public class BigDog extends Dog {
	@Override
	public void greeting() {
		System.out.println("wooow!");
	}
	
	@Override
	public void greeting(Dog another) {
		System.out.println("woooooow!");
	}
	
	public void greeting(BigDog another) {
		System.out.println("woooooooow!");
	}
}
