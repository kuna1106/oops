package javabasics.homework2;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		bubbleSort(array);
		in.close();
	}
	public static void bubbleSort(int[] array) {
		if (array == null) {
			return ;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i : array) {
			System.out.print(i + " " );
		}
	}
}
