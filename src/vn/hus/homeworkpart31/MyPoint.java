package vn.hus.homeworkpart31;

public class MyPoint {
	private int x;
	private int y;
	
public MyPoint() {
		x = 0;
		y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] result = new int[2];
		result[0] = x;
		result[1] = y;
		return result;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%1$d, %2$d)", x, y);
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	public double distance(MyPoint another) {
		return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
	}
	
	public double distance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
}
