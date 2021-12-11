package javabasics.lab1;

import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
		double height = in.nextDouble();
		in.close();

		//
		double baseArea = Math.PI * radius * radius;
		double sufaceAre = 2.0 * Math.PI + 2.0 * baseArea;
		double volume = baseArea * height;
		//
		System.out.printf("base area : %.2f \n", baseArea);
		System.out.printf("suface area : %.2f \n", sufaceAre);
		System.out.printf("Volume : %.2f \n", volume);
	}
}
