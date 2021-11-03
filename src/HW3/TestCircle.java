package HW3;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		
		System.out.println("the circle has radius of "
		+ circle1.getRadius() + " and area of " + circle1.getArea());
		
		Circle circle2 = new Circle(2.0);
		
		System.out.println("the circle has radius of "
		+ circle2.getRadius() + " and area of " + circle2.getArea());
	
		Circle circle3 =  new Circle(2.0, "red");
		
		System.out.println("the circle has radius of "
				+ circle3.getRadius() + " and area of " + circle3.getArea()
				+ " color of " + circle3.getColor());
		
		Circle circle4 = new Circle();
		
		circle4.setRadius(5.5);
		System.out.println("Radius is: " + circle4.getRadius());
		
		circle4.setColor("Green");
		System.out.println("Color is: " + circle4.getColor());
		
		Circle circle5 = new Circle(5.5);
		System.out.println(circle5.toString());
		
		Circle circle6 = new Circle(6.6);
		System.out.println(circle6.toString());
		System.out.println(circle6);
		System.out.println("Operator '+' invokes to String() too: " + circle6);
		Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
		System.out.println(ball);
		
		ball.setX(80.0f);
		ball.setY(35.0f);
		ball.setRadius(5);
		ball.setXDelta(4.0f);
		ball.setYDelta(6.0f);
		System.out.println(ball);
		System.out.println("x is: " + ball.getX());
		System.out.println("y is: " + ball.getY());
		System.out.println("radius is: " + ball.getRadius());
		System.out.println("xDelta is: " + ball.getXDelta());
		System.out.println("yDelta is: " + ball.getYDelta());
		
		float xMin = 0.0f;
		float xMax = 100.0f;
		float yMin = 0.0f;
		float yMax = 50.0f;
		for (int i = 0; i < 15; i++) {
			ball.move();
			System.out.println(ball);
			float xNew = ball.getX();
			float yNew = ball.getY();
			int radius = ball.getRadius();
			if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
				ball.reflectHorizontal();
			} 
			if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
				ball.reflectVertical();
			}
		}
	}
}
