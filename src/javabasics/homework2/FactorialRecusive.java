package javabasics.homework2;

import java.util.Scanner;

public class FactorialRecusive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(factorial(number));
		in.close();
	}
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return factorial(n-1)*n;
		}
	}

}
