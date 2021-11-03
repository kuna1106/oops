package lab1;
import java.util.Scanner;

public class AverageWithInputValidation {
	public static final int NUMSTUDENTS = 3;
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] numberIn =  new int[NUMSTUDENTS];
		boolean isValid;
		int sum = 0;
		int count=0;
		double average;
		
		for (int studentNo = 1; studentNo <= NUMSTUDENTS; ++studentNo) {
			//
			
			isValid = false;
			do {
				if () {
					
				} else {
					System.out.println("Invalid input , try again ...");
				}
			} while(!isValid);
			sum += numberIn[studentNo-1];
			}
			average = (double) sum/NUMSTUDENTS;
			System.out.println("The average: "+ average );
	}
}
