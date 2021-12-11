package oops.homework5.point2dand3d;

public class Point2D {
	private float x = 0.0f;
	private float y = 0.0f;
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D() {
		x = 0.0f;
		y = 0.0f;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY() {
		float[] result = new float[2];
		result[0] = x;
		result[1] = y;
		return result;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y+ ")";
	}
}
