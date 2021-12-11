package javabasics.lab2;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array1 = new int[number];
		int[] array2 = new int[number];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = in.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = in.nextInt();
		}
		in.close();
		System.out.print(equals(array1, array2));
	}
	public static boolean equals(int[] array1, int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			if(array1.length == array2.length && array1[i] == array2[i]) {
				return true;
			}
		}
		return false;
	}
}
