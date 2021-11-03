package HW2;

import java.util.Scanner;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		int fromIdx = 0;
		int toIdx = array.length - 1;
		int key = in.nextInt();
		System.out.println(binarySearch(array, key, fromIdx, toIdx));
		System.out.println(binarySearch(array, key));
	}
	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if (toIdx > fromIdx) {
			int middleIdx = fromIdx + (toIdx - fromIdx) / 2;
			if (array[middleIdx] == key) {
				return true;
			}
			if (array[middleIdx] > key) {
				return binarySearch(array, key, fromIdx, middleIdx-1);
			} else {
				return binarySearch(array, key, middleIdx + 1, toIdx);
			} 
		}
		return false;
	}
	public static boolean binarySearch(int[] array, int key) {
		int first = 0;
		int last = array.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (array[mid] < key) {
				first = mid + 1;
			} else if (array[mid] == key) {
				return true;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return false;
	}
}
