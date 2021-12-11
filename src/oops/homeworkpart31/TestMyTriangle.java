package oops.homeworkpart31;

public class TestMyTriangle {
	public static void main(String[] args) {
		MyTriangle myTriangle1 = new MyTriangle(0, 3, -3, 0, 3, 0);
        System.out.println(myTriangle1);
        System.out.println("The perimeter is: " + myTriangle1.getPerimeter());
        System.out.println("This is " + myTriangle1.getType() + " triangle");

        MyPoint pointA = new MyPoint(8,8);
        MyPoint pointB = new MyPoint(-4,2);
        MyPoint pointC = new MyPoint(3,6);

        MyTriangle myTriangle2 = new MyTriangle(pointA, pointB, pointC);
        System.out.println(myTriangle2);
	}
}
