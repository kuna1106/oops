package javabasics.homework1;

import java.util.Scanner;

public class TimeTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // input
		int size = in.nextInt();
		System.out.println("Enter the size: " + size);
		in.close();
		
		// format the output 
		for (int row = -1; row <= size; row++) {
			if (row == -1) {
				System.out.print("*\t|");
			} else if (row == 0) {
				System.out.print("---------");
			} else {
				System.out.printf("%d\t|", row);
			}
			for (int col = 1; col <= size; col++) {
				if (row == -1) {
					System.out.printf("\t%d", col);
					continue;
				} else if (row == 0) {
					System.out.print("---------");
				} else {
					System.out.printf("\t%d", row * col);
				}
			}
			System.out.println();
		}
	}
}
