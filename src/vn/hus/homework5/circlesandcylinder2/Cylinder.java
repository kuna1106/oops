package vn.hus.homework5.circlesandcylinder2;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		this.height = height;
		base = new Circle();
	}
	
	public Cylinder(double height, double radius) {
		base = new Circle(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return 2 * base.getArea() + (2 * Math.PI * base.getRadius() * height);
	}
	
	public String toString() {
		return "Cylinder[base = " + base.toString() + ", height = " + height+ "]";
	}
}
