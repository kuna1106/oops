package oops.homework4;

public class TestBallAndContainer {
	public static void main(String[] args) {
        // Test Constructor
        Ball ball1 = new Ball(2.0f, 4.0f, 5, 5, 5);
        // Test toString()
        System.out.println(ball1);
        // Test Getters
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        System.out.println(ball1.getRadius());
        System.out.println(ball1.getXDelta());
        System.out.println(ball1.getYDelta());
        // Test Setters
        ball1.setX(10.0f);
        ball1.setY(20.0f);
        ball1.setRadius(15);
        ball1.setXDelta(16.5f);
        ball1.setYDelta(18.5f);
        System.out.println(ball1);
        // Test move()
        ball1.move();
        System.out.println(ball1);
        // Test reflectHorizontal()
        ball1.refectHorizontal();
        System.out.println(ball1);
        // Test reflectVertical()
        ball1.refectVertical();
        System.out.println(ball1);
        System.out.println();

        // Test Container class
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collides(ball);
            System.out.println(ball); // manual check the position of the ball
        }

        System.out.println(box.getX());
        System.out.println(box.getY());
        System.out.println(box.getWidth());
        System.out.println(box.getHeight());
    }
}
