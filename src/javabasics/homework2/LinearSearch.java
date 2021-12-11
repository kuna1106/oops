package javabasics.homework2;

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
		in.close();
	}

	public static boolean linearSearch(int[] array, int key) {
		if (array == null) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearchIndex(int[] array, int key) {
		if (array == null) {
			return 0;
		}
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i;
			}
		}
		return index;
	}
}
