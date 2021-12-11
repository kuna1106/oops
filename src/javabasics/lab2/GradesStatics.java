package javabasics.lab2;

import java.util.Scanner;

public class GradesStatics {
	public static int[] grades;

	public static void main(String[] args) {
		readGrades();
		System.out.println("The grades are: ");
		print(grades);
		System.out.println("The average is " + average(grades));
		System.out.println("The median is  " + median(grades));
		System.out.println("The minimum is " + min(grades));
		System.out.println("The maximum is  " + max(grades));
		System.out.println("The standard deviation is " + stdDev(grades));
	}

	public static void readGrades() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		grades = new int[number];
		int i = 0;
		while (i < number) {
			System.out.printf("Enter the grade for student %1$d: ", i + 1);
			int grade = in.nextInt();
			if (grade > 0 && grade < 100) {
				grades[i] = grade;
				i++;
			} else {
				System.out.print("Error !!!");
			}
		}
		in.close();
	}

	public static void print(int[] array) {
		// TODO Auto-generated method stub
		if (array == null) {
			System.out.println("error");
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.printf("[%1$d", array[i]);
			} else {
				System.out.printf(", %1$d", array[i]);
			}
		}
		System.out.println("] ");
	}

	public static double average(int[] array) {
		if (array == null) {
			return 0.0;
		}
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return (double) sum / array.length;
	}

	public static double median(int[] array) {
		// TODO Auto-generated method stub
		if (array == null) {
			return 0.0;
		}
		double median = 0;
		int arrLen = array.length;
		if (arrLen % 2 == 1) {
			median = array[((arrLen + 1) / 2) - 1];
		} else {
			median = (array[(arrLen / 2) - 1] + array[arrLen / 2])/2;
		}
		return median;
	}

	public static int max(int[] array) {
		// TODO Auto-generated method stub
		if (array == null) {
			return 0; 
		}
		int max = array[0];
		for (int value : array) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	public static int min(int[] array) {
		// TODO Auto-generated method stub
		if (array == null) {
			return 0;
		}
		int min = array[0];
		for (int value : array) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

	public static double stdDev(int[] array) {
		// TODO Auto-generated method stub
		if (array == null) {
            return 0.0;
        }
        
        double avg = average(array);
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i] * array[i] - avg * avg;
        }        
        return Math.sqrt(sum / array.length);
	}
}
