package lab1;

public class CheckOddEven {
	public static void main(String [] args) {
		int [] number= {0, 1, 88, 99, -1, -2};// set the value of 'number' here
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
