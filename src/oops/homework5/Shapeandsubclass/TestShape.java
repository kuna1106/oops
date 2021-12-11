package oops.homework5.Shapeandsubclass;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("SHAPE");
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        System.out.println(shape2.getColor());
        shape2.setColor("grey");
        shape2.setFilled(true);
        System.out.println(shape2);
        System.out.println(shape2.isFilled());

        System.out.println();
        System.out.println("CIRCLE");
        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1.setRadius(6);
        System.out.println(circle1.getRadius());

        Circle circle3 = new Circle(5, "yellow", true);
        System.out.println(circle3);

        System.out.println();
        System.out.println("RECTANGLE");
        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());
        rectangle1.setWidth(2);
        rectangle1.setLength(3);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(4,5);
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

        Rectangle rectangle3 = new Rectangle(6,5,"pink", false);
        System.out.println(rectangle3);

        System.out.println();
        System.out.println("SQUARE");
        // Test Square class
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(5);
        System.out.println(square2);

        Square square3 = new Square(6,"black", true);
        System.out.println(square3);
        System.out.println(square3.getArea());
        System.out.println(square3.getPerimeter());
	}
}
