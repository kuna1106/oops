package oops.homeworkpart31;

public class MyRectangle {
	private final MyPoint topLeft;
    private final MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopRight() {
        int x = bottomRight.getX();
        int y = topLeft.getY();
        return new MyPoint(x,y);
    }

    public MyPoint getBottomLeft() {
        int x = topLeft.getX();
        int y = bottomRight.getY();
        return new MyPoint(x, y);
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomLeft=" + getBottomLeft() +
                ",bottomRight=" + bottomRight + ",topRight=" + getTopRight() + "]";
    }

    public double getPerimeter() {
        return topLeft.distance(getBottomLeft()) + getBottomLeft().distance(bottomRight) +
                bottomRight.distance(getTopRight()) + getTopRight().distance(topLeft);
    }

    public String getType() {
        double sideA = topLeft.distance(getBottomLeft());
        double sideB = getBottomLeft().distance(bottomRight);
        double sideC = bottomRight.distance(getTopRight());
        double sideD = getTopRight().distance(topLeft);

        if (sideA == sideB && sideB == sideC && sideC == sideD) {
            return "Square";
        } else {
            return "Rectangle";
        }
    }
}
