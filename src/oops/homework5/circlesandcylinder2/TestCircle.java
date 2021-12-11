package oops.homework5.circlesandcylinder2;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(5);
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(5, 6);
        System.out.println(cylinder3);

        cylinder3.setHeight(8);
        System.out.println(cylinder3.getHeight());
	}
}
