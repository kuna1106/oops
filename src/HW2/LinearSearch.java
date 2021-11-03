package HW2;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		int key = in.nextInt();
		System.out.print("index for linear search : " + linearSearchIndex(array, key));
	}

	public static boolean linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearchIndex(int[] array, int key) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i;
			}
		}
		return index;
	}
}
