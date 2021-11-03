package HW1;

import java.util.Scanner;

public class BoxPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Enter the size:" + size);
		in.close();

		// X=A
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || col == 1 || col == size) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("_____________");

		// X=B
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || row == col) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("_____________");

		// X=C
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || row + col == size + 1) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("_____________");

		// X=D
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || row + col == size + 1 || row == col) {
					System.out.print(" #");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
