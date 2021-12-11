package oops.lab6.polylineofpoint;

public class TestMain {
	public static void main(String[] args) {
		Point point1 = new Point(3, 2);
		
		PolyLine polyLine1 = new PolyLine();
		polyLine1.appendPoint(1, 3);
		polyLine1.appendPoint(point1);
		
		System.out.println(polyLine1);
		System.out.println(polyLine1.getLength());
	}
}
