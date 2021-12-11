package oops.homework5.Shapeandsubclass;

public class Square extends Rectangle {
	
	public Square() {
		
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		setSide(side);
	}
	
	public void setLength(double side) {
		setSide(side);
	}
	
	public double getArea() {
		return getSide() * getSide();
	}
	
	public double getPerimeter() {
		return 4 * getSide();
	}
	
	public String toString() {
		return "A square with side " + getSide() + 
				", which is a subclass of" + super.toString();
	}
}
