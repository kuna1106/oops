package lab2;

import java.util.Scanner;

public class printArrayInStars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM_ITEMS;
		int[] items;

		// Prompt for the number of items and read input as "int"
		System.out.print("Enter the number of items :");
		NUM_ITEMS = in.nextInt();
		items = new int[NUM_ITEMS];
		// Prompt and read the items into the "int" array , if array length > 0
		System.out.print("Enter the value of all items :");
		if (items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				items[i] = in.nextInt();
			}
		}
		in.close();
		// print value as number of stars
		for (int idx = 0; idx < items.length; ++idx) {
			System.out.print(idx + ": ");
			for (int starNo = 1; starNo <= items[idx]; ++starNo) {
				System.out.print("*");
			}
			System.out.print("(" + items[idx] + ")");
			System.out.println();
		}
	}
}
