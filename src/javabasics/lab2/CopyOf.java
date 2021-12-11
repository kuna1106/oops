package javabasics.lab2;

import java.util.Scanner;

public class CopyOf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		for (int i : copyOf(array)) {
			System.out.print(i + " ");
		}
	}
	public static int[] copyOf(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
}
