package lab1;

import java.util.Scanner;

public class SumProductMinMax3 {
	public static void main(String [] args ) {
		// the 3 input integers
		int number1;
		int number2;
		int number3;
		
		// to compute these
		int sum;
		int product;
		int min;
		int max;
		
		// prompt and read inputs as "int"
		Scanner in = new Scanner(System.in); // Scan the keyboard
		number1 = in.nextInt();
		number2 = in.nextInt();
		number3 = in.nextInt();
		in.close();
		
		//compute sum and product
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		
		// compute min
		min = number1;
		if (number2 < min) {
			min = number2;
		} else if (number3 < min) {
			min = number3;
		}
		
		// compute max
		max = number1;
		if (number2 > max) {
			max = number2;
		} else if (number3 > max) {
			max = number3;
		}
		
		//print results
		System.out.println("Enter 1st integer: "+number1);
		System.out.println("Enter 2st integer: "+number2);
		System.out.println("Enter 3st integer: "+number3);
		System.out.println("The sum is : "+sum);
		System.out.println("The product is: "+product);
		System.out.println("The max is: "+max);
		System.out.println("The min is: "+min);
 	}
}
