package javabasics.homework1;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in); // input 
		int size = in.nextInt();
		System.out.println("Enter the size :"+size);
		in.close();
		// using for nested for-loops
		for (int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				System.out.print("#"+" ");
			}
			System.out.println();
		}
	}
}
