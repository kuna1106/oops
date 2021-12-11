package javabasics.lab2;

import java.util.Scanner;

public class GradesStatistics {
	public static int GRADE_MINUMUM = 0;
	public static int GRADE_MAXNIMUM = 100;

	public static double getAverage(int[] grades) {
		if (grades == null) {
			return 0.0;
		}
		int sum = 0;
		for (int grade : grades) {
			sum += grade;
		}
		return (double) sum / grades.length;
	}

	public static int getMinimum(int[] grades) {
		if (grades == null) {
			return 0;
		}
		int min = grades[0];
		for (int grade : grades) {
			if (min > grade) {
				min = grade;
			}
		}
		return min;
	}

	public static int getMaximum(int[] grades) {
		if (grades == null) {
			return 0;
		}
		int max = grades[0];
		for (int grade : grades) {
			if (max < grade) {
				max = grade;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numStudents = in.nextInt();
		int[] grades = new int[numStudents];

		int i = 0;
		while (i < numStudents) {
			System.out.printf("Enter grade for student %1$d: ", (i + 1));
			int grade = in.nextInt();
			if (GRADE_MINUMUM <= grade && grade <= GRADE_MAXNIMUM) {
				grades[i] = grade;
				i++;
			} else {
				System.out.println("Error! must be int between 0 and 100");
			}
		}
		in.close();
		//
		System.out.printf("The average is: %1$.2f \n", getAverage(grades));
		System.out.printf("The minimum is: %1$d \n", getMinimum(grades));
		System.out.printf("The maximum is: %1$d \n", getMaximum(grades));
	}
}
