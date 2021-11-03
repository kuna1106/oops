package lab2;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		//
		reverse(array);
	}
	public static void reverse(int[] array) {
		for (int fIdx = 0, bIdx = array.length-1; fIdx < bIdx; ++fIdx, --bIdx) {
			int temp = array[fIdx];
			array[fIdx] = array[bIdx];
			array[bIdx] = temp;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
