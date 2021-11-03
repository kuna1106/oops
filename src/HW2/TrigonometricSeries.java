package HW2;

import java.util.Scanner;

public class TrigonometricSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		int numTerm = in.nextInt();
		in.close();
		//
		System.out.println("format : "+ Math.sin(x));
		System.out.println("format : "+ Math.cos(x));
		System.out.println("valua of sin : "+ sin(x, numTerm));
		System.out.println("valua of cos : "+ cos(x, numTerm));
	}

	public static int factorial(int number) {
		int fac = 1;
		for (int i = 1; i <= number; i++) {
			fac *= i;
		}
		return fac;
	}

	public static double sin(double x, int numTerm) {
		double valuaSin = 0.0;
		for (int i = 0; i < numTerm; i++) {
			double temp;
			if (i % 2 == 0) {
				temp = (double) (Math.pow(x, 2 * i + 1) / factorial(2 * i + 1));
			} else {
				temp = (double) (-Math.pow(x, 2 * i + 1) / factorial(2 * i + 1));
			}
			valuaSin += temp;
		}
		return valuaSin;
	}

	public static double cos(double x, int numTerm) {
		double valuaCos = 0.0;
		for (int i = 0; i < numTerm; i++) {
			double temp;
			if (i % 2 == 0) {
				temp = (double) (Math.pow(x, 2 * i) / factorial(2 * i));
			} else {
				temp = (double) (-Math.pow(x, 2 * i ) / factorial(2 * i));
			}
			valuaCos += temp;
		}
		return valuaCos;
	}
}
