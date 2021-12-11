package javabasics.lab1;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
	static final int SENTINEL = -1; 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the monthly salary (or -1 to end): ");
		int salary = in.nextInt();
		int age ;
		
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		while (salary != SENTINEL) {
			System.out.println("Enter the age: ");
			age = in.nextInt();
			int contributableSalary;
			double employeeContribution;
			double employerContribution;
			double totalContribution;

			if (salary > 6000) {
				contributableSalary = 6000;
			} else {
				contributableSalary = salary;
			}

			if (age <= 55) {
				employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
				employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;

			} else if (age <= 60) {
				employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
				employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
			} else if (age <= 65) {
				employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
				employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
			} else {
				employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
				employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
			}

			System.out.println("The employee's contribution is: $" + employeeContribution);
			System.out.println("The employer's contribution is: $" + employerContribution);
			totalContribution = employerContribution + employeeContribution;
			System.out.println("The total contribution is: $" + totalContribution);
			//
			System.out.println("_________________________________________________");
			
			System.out.println("Enter the monthly salary (or -1 to end): ");
			salary = in.nextInt();
		}
		in.close();
	}
}
