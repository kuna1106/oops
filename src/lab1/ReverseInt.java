package lab1;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inNumber = sc.nextInt(); // read integer in input
		sc.close();
		int inDigit;
		int temp = 0;
		while (inNumber > 0) {
			inDigit = inNumber % 10;
			temp = temp * 10 + inDigit; // reverse for number
			inNumber /= 10;
		}
		System.out.print("The reverse is : " + temp);
	}
}
