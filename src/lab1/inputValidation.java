package lab1;

import java.util.Scanner;

public class inputValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberIn = sc.nextInt();
		sc.close();
		boolean isValid;
		isValid = false;// default assuming input is not valid
		do {
			System.out.println("Enter a number between 0 -10 or 90-100: " + numberIn);
			if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)) {
				isValid = true;
			} else {
				System.out.println("inValid Input , try again ...");
			}
		} while (!isValid);
		if (isValid == true) {
			System.out.println("you have entered: " + numberIn);
		}
	}
}
