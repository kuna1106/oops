package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		System.out.print(arrayToString(array));
	}
	public static String arrayToString(int [] array) {
		return Arrays.toString(array);
	}
}
