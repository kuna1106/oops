package javabasics.lab1;

public class ExtractDigits {
	public static void main(String [] args) {
		int n =  15423;
		int digit = 0;
		while(n > 0) {
			digit = n%10;
			System.out.print(digit+" "); // print digit
			n = n/10;
		}
		System.out.println();
	}
}
