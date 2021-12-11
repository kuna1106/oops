package javabasics.lab1;

public class PrintDayInWord {
	public static void main(String[] args) {
		int[] number = { 0, 1, 2, 3, 4, 5, 6, 7 };
		for (int i : number) {
			// using if-else statement
			{
				if (i == 0) {
					System.out.println("Sunday");
				} else if (i == 1) {
					System.out.println("Monday");
				} else if (i == 2) {
					System.out.println("Tuesday");
				} else if (i == 3) {
					System.out.println("Wednesday");
				} else if (i == 4) {
					System.out.println("Thursday");
				} else if (i == 5) {
					System.out.println("Friday");
				} else if (i == 6) {
					System.out.println("Saturday");
				} else {
					System.out.print("Not a value day ");
				}
			}
			// using switch case
			switch (i) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.print("Not a value day ");
			}
		}
	}
}
