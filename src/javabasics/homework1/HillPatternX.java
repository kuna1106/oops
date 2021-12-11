package javabasics.homework1;

import java.util.Scanner;

public class HillPatternX {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int numRows = in.nextInt();
		in.close();
		
		// Hill patternA
		for (int row = 1; row <= numRows; row++) {
			for (int col =1; col <= numRows*2-1; col++) {
				if (row + col >= numRows+1 && row >= col - numRows + 1) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		System.out.println("____________");
		// hill pater B
		for (int row = 1; row <= numRows; row++) {
			for (int col =1; col <= numRows*2-1; col++) {
				if ( col >= row && row + col <= 2*numRows) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		System.out.println("____________");
		// hill pattern C
		for (int row = 1; row <= numRows; row++) {
			for (int col =1; col <= numRows*2-1; col++) {
				if (row + col >= numRows+1 && row >= col - numRows + 1) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		for (int row = 1; row <= numRows; row++) {
			for (int col =1; col <= numRows*2-1; col++) {
				if ( col >= row && row + col <= 2*numRows) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		System.out.println("____________");
		// hill pattern D
		
	}
}
