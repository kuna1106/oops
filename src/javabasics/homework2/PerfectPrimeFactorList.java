package javabasics.homework2;

import java.util.Scanner;

public class PerfectPrimeFactorList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		printPrimeFactor(number);
		in.close();
	}

	public static void printPrimeFactor(int aPosInt) {
		for (int i = 1; i < aPosInt; i++) {
			if (isProductOfPrimeFactors(i) == true) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isProductOfPrimeFactors(int aPosInt) {
		int result = 1;
		for (int i = 2; i < aPosInt; i++) {
			if (isPrime(i) == true) {
				if (aPosInt % i == 0) {
					result *= i;
				}
			}
		}
		if (result == aPosInt) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int number) {
		if (number == 1) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
