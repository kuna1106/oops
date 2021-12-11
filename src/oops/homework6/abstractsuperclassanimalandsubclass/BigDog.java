package oops.homework6.abstractsuperclassanimalandsubclass;

public class BigDog extends Dog {
	public BigDog(String name) {
		super(name);
	}
	
	@Override
	void greets() {
		System.out.println("wooow");
	}
	
	@Override
	public void greets(Dog another) {
		System.out.println("wooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("woooooooow");
	}
}
