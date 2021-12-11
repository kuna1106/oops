package javabasics.lab2;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int number = in.nextInt();
		int key = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		//
		System.out.print(search(array,key));
	}
	public static int search(int[] array, int key) {
		if (array == null) {
			return 0;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
