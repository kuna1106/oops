package javabasics.lab1;

/*
 * This program prints "PASS" if the int variable "mark" is more than or equal to 50;
 * or prints "FAIL" otherwise. The program shall always print "DONE" before exiting.
 */

public class CheckPassFail {
	public static void main(String [] args) {
		int [] mark = {0,49,50,51,100};//set the value of 'mark'
		for (int i : mark) {
			// if-else statement
			if(i >= 50) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
		System.out.println("DONE");
  }
}
