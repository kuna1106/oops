package lab2;

import java.util.Scanner;

public class GradesHistogram {
	public static int[] grades;
	public static int[] bins = new int[10];

	public static void main(String[] args) {
		readGrades();
		computeHistogram();
		printHistogramHorizontal();
		printHistogramVertical();
	}

	public static boolean isGrades(int grade) {
		return (grade >= 0 && grade <= 100);
	}

	public static void readGrades() {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		grades = new int[number];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = in.nextInt();
		}
	}

	public static void computeHistogram() {
		for (int i = 0; i < grades.length; i++) {
			int j = (grades[i] == 100) ? 9 : grades[i] / 10;
			bins[j] += 1;
		}
	}

	public static void printHistogramHorizontal() {
		System.out.println();
		for (int i = 0; i < bins.length; i++) {
			int delta = (i == bins.length - 1) ? 10 : 9;
			System.out.printf("%2d -%3d:", (i * 10), (i * 10 + delta));
			for (int j = 0; j < bins[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printHistogramVertical() {
		// find out number of rows to output histogram
		int maxBin = bins[0];
		for (int i = 0; i < bins.length; i++) {
			maxBin = (bins[i] > maxBin) ? bins[i] : maxBin;
		}

		// print histogram
		System.out.println();
		for (int i = maxBin; i >= 0; i--) {
			if (i == 0) {
				for (int j = 0; j < bins.length; j++) {
					int delta = (j == bins.length - 1) ? 10 : 9;
					System.out.printf("%2d-%-2d ", (j * 10), (j * 10 + delta));
				}
			} else {
				for (int j = 0; j < bins.length; j++) {
					String str = (bins[j] < i) ? " " : "*";
					System.out.printf("%3s%-2s ", str, " ");
				}
			}
			System.out.println();
		}
	}
}
