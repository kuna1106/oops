package HW2;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		System.out.println("These prime number is :");
		printPrime(number);
	}
	
	public static void printPrime(int number) {
		for (int i = 1; i <= number; i++) {
			if (isPrime(i) == true) {
				System.out.println(i + " ");
			}
		}
	}
	
	public static boolean isPrime(int number) {
		if (number == 1) {
			return	true;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
}
