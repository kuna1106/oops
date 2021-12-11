package oops.homeworkpart31;

import java.util.Arrays;

public class TestMyCircle {
	public static void main(String[] args) {
	    // Test Constructors
	    MyCircle myCircle = new MyCircle(4, 3, 6);
	    System.out.println(myCircle);
	
	    System.out.println("x is: " + myCircle.getCenterX());
	    System.out.println("y is: " + myCircle.getCenterY());
	    System.out.println("array x y is: " + Arrays.toString(myCircle.getCenterXY()));
	    System.out.println("radius is: " + myCircle.getRadius());
	    System.out.println(myCircle);
	    myCircle.setCenterX(2);
	    myCircle.setCenterY(9);
	    System.out.println(myCircle);
	    myCircle.setCenterXY(12, 12);
	    System.out.println(myCircle);
	
	    // Test another Constructor
	    MyCircle myCircle2 = new MyCircle(myCircle.getCenter(), myCircle.getRadius());
	    System.out.println(myCircle2);
	    myCircle2.setRadius(15);
	    System.out.println(myCircle2);
	
	    // Test another Constructor
	    MyCircle myCircle3 = new MyCircle();
	    System.out.println(myCircle3);
	    myCircle3.setCenter(myCircle.getCenter());
	    System.out.println(myCircle3);
	
	    // Test methods
	    System.out.println("area of circle 1 is: " + myCircle.getArea());
	    System.out.println("area of circle 2 is: " + myCircle2.getArea());
	    System.out.println("area of circle 3 is: " + myCircle3.getArea());
	
	    System.out.println("circumference of circle 1 is: " + myCircle.getCircumference());
	    System.out.println("circumference of circle 2 is: " + myCircle2.getCircumference());
	    System.out.println("circumference of circle 3 is: " + myCircle3.getCircumference());
	
	    myCircle2.setCenterX(11);
	    myCircle2.setCenterY(23);
	    System.out.println("distance is : " + myCircle2.distance(myCircle3));
    }
}
