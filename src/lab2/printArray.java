package lab2;

import java.util.Scanner;

public class printArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM_ITEMS;
		int[] items;

		// Prompt for the number of items and read input as "int"
		System.out.print("Enter the number of items :");
		NUM_ITEMS = in.nextInt();
		//
		items = new int[NUM_ITEMS];
		// Prompt and read items into the "int" array, if array length >0
		System.out.print("Enter the value of all items: ");
		if (items.length > 0) {
			for (int i = 0; i < items.length; i++) {
				items[i] = in.nextInt();
			}
		}
		in.close();
		// print array contents
		System.out.print("The value are : ");
		for (int i = 0; i < items.length; i++) {
			if (i == 0) {
				System.out.print(items[i]);
			} else {
				System.out.print("," + items[i]);
			}
		}
	}
}
