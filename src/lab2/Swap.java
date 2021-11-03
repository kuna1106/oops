package lab2;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array1 = new int[number];
		int[] array2 = new int[number];
		for (int i = 0; i < array2.length; i++) {
			array1[i] = in.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = in.nextInt();
		}
		in.close();
	}
	public static boolean swap(int[] array1, int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			if (array1.length == array2.length) {
				int temp = array1[i];
				array1[i] = array2[i];
				array2[i] = temp;
			}
		}
		return true;
	}
}
