package oops.homeworkpart31;

public class TestMyRectangle {
	public static void main(String[] args) {
		MyRectangle myRectangle1 = new MyRectangle(1,7,6,3);
        System.out.println(myRectangle1);
        System.out.println("perimeter is: " + myRectangle1.getPerimeter());
        System.out.println("type is: " + myRectangle1.getType());

        MyRectangle myRectangle2 = new MyRectangle(2,4,4,2);
        System.out.println(myRectangle2);
        System.out.println("perimeter is: " + myRectangle2.getPerimeter());
        System.out.println("type is: " + myRectangle2.getType());
	}
}
