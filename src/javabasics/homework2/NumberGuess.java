package javabasics.homework2;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
	
	static int secretNumber;
	
	public static void main(String[] args) {
		generateSecretNumber(10);
		runGame();
	}
	
	public static void generateSecretNumber(int maxValue) {
		Random rand = new Random();
		secretNumber = rand.nextInt(maxValue);
	}
	
	public static void runGame() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Key: ");
		int trials = 0;
		while (true) {
			int trialNumber = (in.hasNextInt()) ? in.nextInt() : -1;
			
			trials++;
			if (secretNumber == trialNumber) {
				System.out.printf("You got it in %d trials! \n", trials);
				break;
			} else if (secretNumber > trialNumber) {
				System.out.printf("Try highter \n");
			} else {
				System.out.println("try lower");
			}
		}
		in.close();
	}
}
