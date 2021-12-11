package javabasics.homework2;

import java.util.Scanner;

public class TrigonometricSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		int numTerm = in.nextInt();
		in.close();
		//
		System.out.println("fomat: " + Math.sin(Math.PI/6));
		System.out.println("valua of sin : "+ sin(x, numTerm));
		System.out.println("fomat: " + Math.cos(Math.PI/6));
		System.out.println("valua of cos : "+ cos(x, numTerm));
	}

	public static double sin(double x, int numTerm) {
		// convert x to radian
		x = x *(3.14 / 180.0);
		double term = x;
		double sum = x;
		for (int i = 1; i <= numTerm; i++) {
			term = (term * (-1) * x * x) / (2 * i * (2 *i +1));
			sum += term;
		}
		return sum;
	}

	public static double cos(double x, int numTerm) {
		// convert x to radian
		x = x *(3.14 / 180.0);
		double term = 1;
		double sum = x;
		for (int i = 1; i <= numTerm; i++) {
			term *= ((-1) * x * x) / ((2 * i - 1) * 2 * i);
			sum = sum + term;
		}
		return sum;
	}
}
