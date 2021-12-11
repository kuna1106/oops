package javabasics.homework1;

import java.util.Scanner;

public class TriangularPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.close();

		// X=A
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= row; col++) {
					System.out.print("# ");
			}
			System.out.println();
		}

		System.out.println("_______________");
		// X=B
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size -row + 1; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}

		System.out.println("_______________");

		// X=C
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row <= col) {
					System.out.print(" #");
					;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("_______________");

		// X=D
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row + col >= size + 1) { // 
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
