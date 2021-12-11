package javabasics.homework2;

import java.util.Scanner;

public class SpecialSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		int numTerm = in.nextInt();
		//
		in.close();
		System.out.print(sumOfSeries(x, numTerm));
	}

	public static double sumOfSeries(double x, int numTerms) {
		double sum = 0.0;
		if (x > -1 && x < 1) {
			sum = x;
			// System.out.println("u["+0+"] = "+x);
			for (int k = 1; k < numTerms; k++) {
				double uk = Math.pow(x, 2 * k + 1) / (double) (2 * k + 1);
				for (int i = 2 * k - 1; i > 0; i -= 2) {
					uk *= i / (double) (i + 1);
				}
				// System.out.println("u["+k+"] = "+uk);
				sum += uk;
			}
		} else {
			sum = Double.NaN;
		}
		return sum;
	}
}
