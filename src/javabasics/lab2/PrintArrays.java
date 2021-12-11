package javabasics.lab2;

import java.util.Scanner;

public class PrintArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt(); 
		}
		in.close();
		print(array);
	}
	public static void print(int [] array) {
		if (array == null) {
			System.out.println("errors");
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.printf("[%1$d",array[i]);
			} else {
				System.out.printf(", %1$d",array[i]);
			}
		}
		System.out.print("]\n");
	}
}
