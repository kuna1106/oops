package javabasics.homework2;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();

		System.out.println("GCD : " + gcd(number1, number2));
		System.out.print("GCD recursive : " + gcdRecursive(number1, number2));
		in.close();
	}

	public static int gcd(int a, int b) {
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static int gcdRecursive(int a, int b) {
		if (b == 0) {
			return a;
		}
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}

		temp = b;
		b = a % b;
		a = temp;
		return gcdRecursive(a, b);
	}
}
