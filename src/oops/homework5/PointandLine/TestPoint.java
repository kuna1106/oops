package oops.homework5.PointandLine;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		System.out.println(p1);
		
		p1.setX(26);
		p1.setY(6);
		System.out.println(p1);
		
		p1.setXY(11, 6);
		System.out.println(p1);
	}
}
