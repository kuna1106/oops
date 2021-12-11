package javabasics.lab1;

public class SumAverageRunningInt {
	public static void printSumAverageNumber() {
		// average from 111 to 8999
		int count = 0;
		double sum = 0;
		for (int i = 111; i <= 8899; i++) {
			count++;
		}
		System.out.println(count);
		int number = 111;
		do {
			sum += number;
			++number;
		} while (number <= 8899);
		System.out.printf("Sum Average : %f \n", sum / count);
	}

	public static void printSumSquares() {
		// sum of the squares from 1 to 100
		int sum = 0;
		int number = 1;
		while (number <= 100) {
			sum += number * number;
			++number;
		}
		System.out.printf("sum of the squares : %d \n", sum);
	}

	public static void main(String[] args) {
		double sum = 0.0;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		// using the while-do
		{
			int count = 0;
			int number = LOWERBOUND;
			while (number <= UPPERBOUND) {
				sum += number;
				++number;
				count++;
			}
			System.out.printf("sum : %f \n ", sum);
			System.out.printf("average : %f \n", sum / count);
		}

		// using the do-while
		{
			int count = 0;
			int number = LOWERBOUND;
			do {
				sum += number;
				++number;
				count++;
			} while (number <= UPPERBOUND);
			System.out.printf("sum: %f \n ", sum);
			System.out.printf("average : %f \n ", sum / count);
		}
		printSumAverageNumber();
		printSumSquares();
	}
}
