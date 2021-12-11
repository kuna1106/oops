package oops.homework6.abstractsuperclassshape;

public class Circle extends Shape {
	protected double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public String toString() {
		return "Circle[ " + super.toString() + " ,radius = " + radius + "]";
	}
}
