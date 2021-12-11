package javabasics.homework2;

import java.util.Scanner;

public class PerfectAndDecficientNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		System.out.print("These numbers is perfect :" );
		printPerfect(number);
		System.out.println();
		System.out.print("These numbers is neither deficient :");
		printDecficient(number);
		System.out.println();
		in.close();
	}
	public static void printPerfect(int aPosInt) {
		for (int i = 1; i <= aPosInt; i++) {
			if (isPerfect(i) == true) {
				System.out.print(i + " ");
			}
		}
	}
	public static void printDecficient(int aPosInt) {
		for (int i = 1; i <= aPosInt; i++) {
			if (isDecficient(i) == true) {
				System.out.print(i + " ");
			}
		}
	}
	public static boolean isPerfect(int aPosInt) {
		int sum = 0;
		for (int i = 1; i < aPosInt; i++) {
			if (aPosInt % i == 0) {
				sum += i;
			}
		}
		if (sum == aPosInt) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isDecficient(int aPosInt) {
		int sum = 0;
		for (int i = 1; i < aPosInt; i++) {
			if (aPosInt % i  == 0) {
				sum += i;
			}
		}
		if (sum > aPosInt) {
			return true;
		} else {
			return false;
		}
	}
}
