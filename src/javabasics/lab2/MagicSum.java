package javabasics.lab2;

import java.util.Scanner;

public class MagicSum {
	public static final int SENTINEL = -1;

	public static boolean hasEight(int number) {
		int digit;
		while (number > 0) {
			digit = number % 10;
			if (digit == 8) {
				return true;
			}
			number /= 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a positive integer (or -1 to end): ");
		int number = in.nextInt();
		int sum = 0;
		while (number != SENTINEL) {
			if (hasEight(number) == true) {
				sum = sum + number;
			}
			System.out.print("enter a positive integer (or -1 to end): ");
			number = in.nextInt();
		}
		in.close();
		System.out.println("The magic sum is: " + sum);
	}
}
