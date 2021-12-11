package javabasics.lab1;

/*
 * This program prints "Odd Number" if the int variable "number" is odd, or "Even Number" otherwise. 
 * The program shall always print "BYE!"" before exiting.
 */

public class CheckOddEven {
	public static void main(String[] args) {
		int[] number = { 0, 1, 88, 99, -1, -2 };// set the value of 'number' here
		for (int i : number) {
			// if-else statement
			if (i % 2 == 0) {
				System.out.println("Even Number");// even number
			} else {
				System.out.println("Odd Number");// odd number
			}
		}
	}
}
