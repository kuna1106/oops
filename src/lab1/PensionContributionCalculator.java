package lab1;

import java.util.Scanner;

public class PensionContributionCalculator {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int salary = in.nextInt();
		int age = in.nextInt();
		System.out.println("Enter the monthly salary: "+salary);
		System.out.println("Enter the age: "+age);
		//
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		//
		int contributableSalary;
		double employeeContribution;
		double employerContribution;
		double totalContribution;
		
		contributableSalary = 
	}
}
