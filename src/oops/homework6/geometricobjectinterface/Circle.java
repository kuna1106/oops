package oops.homework6.geometricobjectinterface;

public class Circle implements GeometricObject {
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle[ radius = " + radius + "]";
	}

	public void resize(int percent) {
		// TODO Auto-generated method stub
		
	}
}
