package javabasics.lab1;
import java.util.Scanner;

public class AverageWithInputValidation {
	public static final int NUMSTUDENTS = 3;
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;
		
		for (int studentNo = 1; studentNo <= NUMSTUDENTS; ++studentNo) {
			
			
			isValid = false;
			do {
				System.out.println("Enter the mark (0 - 100) for student " + studentNo + ":");
				numberIn = in.nextInt();
				if (numberIn >= 0 && numberIn <= 100) {
					isValid = true;
				} else {
					System.out.println("Invalid inpput, try again...");
				}
			} while (!isValid);
			sum += numberIn;
		}
		average = sum / NUMSTUDENTS;
		System.out.println("The average is : " + average);
		in.close();
	}
}
