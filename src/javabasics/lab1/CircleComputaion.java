package javabasics.lab1;

import java.util.Scanner;

public class CircleComputaion {
	public static void main(String[] args) {
		// variable
		double radius;
		double diameter;
		double circumference;
		
		// Prompt and read inputs as "double"
		Scanner in = new Scanner(System.in); // Scan input for keybroad

		radius = in.nextDouble();
		in.close();	
		
		// compute in 'Double'
		diameter = 2.0 * radius;
		circumference = 2.0 * Math.PI * radius;
		// print results
		System.out.printf("diameter : %.2f \n", diameter);
		System.out.printf("circumference : %.2f \n", circumference);
	}
}
