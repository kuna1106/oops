package HW2;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		
		System.out.println("GCD : " + gcd(number1, number2));
	}
	
	public static int gcd(int a, int b) {
		int temp;
		while (b != 0) {
			temp  = b;
			b = a % b;
			a =  temp;
		}
		return  a;
	}
}
