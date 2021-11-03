package lab1;

import java.awt.geom.CubicCurve2D;
import java.util.Scanner;

public class CircleComputaion {
	public static void main(String[] args) {
		// variable
		double radius;
		double diameter;
		double circumference;
		double area;

		// Prompt and read inputs as "double"
		Scanner in = new Scanner(System.in); // Scan input for keybroad
		radius = in.nextDouble();

		// compute in 'Double'
		diameter = 2.0 * radius;
		circumference = 2.0 * Math.PI * radius;
		area = Math.PI * radius * radius;
		// print results
		System.out.printf("diameter : %.2f \n", diameter);
		System.out.printf("circumference : %.2f \n", circumference);
	}
}
