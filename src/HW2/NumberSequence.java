package HW2;

import java.util.Scanner;

public class NumberSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		System.out.println(getLengthNumber(number));

	}
	
	public static String getLengthNumber(int number) {
		if (number == 1) {
			return "1";
		} else {
			return getLengthNumber(number - 1) + numOfDigits(number);
		}
	}
	
	public static String numOfDigits(int n) {
		return Integer.toString(n);
	}
}
