package lab2;

import java.util.Scanner;

public class Contains {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		int key = in.nextInt();
		in.close();

		System.out.println(contains(array, key));
	}

	public static boolean contains(int[] array, int key) {
		for (int i : array) {
			if (i == key) {
				return true;
			}
		}
		return false;
	}
}
