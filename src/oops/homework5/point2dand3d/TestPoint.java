package oops.homework5.point2dand3d;

import java.util.Arrays;

public class TestPoint {
	public static void main(String[] args) {
		Point2D point2D1= new Point2D(10.0f, 15.0f);
		System.out.println(point2D1);
		point2D1.setXY(14.5f, 19.333f);
		System.out.println(Arrays.toString(point2D1.getXY()));
		
		Point3D point3D1 = new Point3D(3.5f, 6.5f, 9.5f);
		System.out.println(point3D1);
		System.out.println(point3D1.getZ());
		point3D1.setZ(59.99f);
		System.out.println(point3D1.getZ());
		point3D1.setXYZ(49.99f, 69.99f, 99.99f);
		System.out.println(Arrays.toString(point3D1.getXYZ()));
		
		Point3D point3D2 = new Point3D();
		System.out.println(point3D2);
	}
}
