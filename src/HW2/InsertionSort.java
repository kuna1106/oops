package HW2;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		insertionSort(array);
	}
	
	public static void insertionSort(int[] array) {
		int lenArr = array.length;
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i-1;
			while (j >= 0  && array[j] > key) {
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
