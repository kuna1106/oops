package oops.homework6.geometricobjectinterface;

public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject circle1 = new Circle(5);
		System.out.println(circle1);
		System.out.println(circle1.getArea());
		System.out.println(circle1.getPerimeter());
		
		GeometricObject rec1 = new Rectangle(2, 4);
		System.out.println(rec1);
		System.out.println(rec1.getArea());
		System.out.println(rec1.getPerimeter());
		
	}
}
