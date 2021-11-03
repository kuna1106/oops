package HW2;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		System.out.println(gcd(number1,number2));
	}
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, remainder(a,b));
		}
	}
	
	public static int remainder(int a, int b) {
		// TODO Auto-generated method stub
			return a % b;
	}
}
