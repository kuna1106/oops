package javabasics.lab1;

import java.util.Scanner;

public class ComputePI {
	public static void main(String[] args) {
		int maxDenominator;
		int counter = 0;
		double terms = 0, result;
		Scanner in = new Scanner(System.in);
		in.close();

		System.out.println("Enter the maximum denominator: ");
		maxDenominator = in.nextInt();

		for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
			terms += Math.pow(-1, counter) * (1.0 / denominator);
			counter++;
		}

		result = 4 * terms;

		System.out.printf("The PI computed is: %.10f", result);
		// percents of Math.PI
		System.out.printf("(piComputed/Math.PI)*100 = %.2f \n", result / Math.PI);
	}
}
