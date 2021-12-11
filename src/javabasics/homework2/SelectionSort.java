package javabasics.homework2;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		selectionSort(array);
		in.close();
	}
	public static void selectionSort(int[] array) {
		if (array == null) {
			return;
		}
		for (int i = 0; i < array.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < array.length ; j++) {
				if (array[j] < array[minIdx]) {
					minIdx = j;
				}
			}
			int temp = array[minIdx];
			array[minIdx] = array[i];
			array[i] = temp;
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
