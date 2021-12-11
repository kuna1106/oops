package javabasics.homework1;

import java.util.Scanner;

public class CountVowelsDigits {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int inStrLen;
		
		// 
		inStr = in.next().toLowerCase();
		System.out.println("Enter the String : " +inStr);
		inStrLen = inStr.length();
		in.close();
		int countDegit = 0;
		int countVowel = 0;
		for (int charInd = 0;charInd < inStrLen; charInd++) {
			if (inStr.charAt(charInd) >= '0' && inStr.charAt(charInd) <= '9') {
				countDegit++;
			}
			if (inStr.charAt(charInd) =='u' || inStr.charAt(charInd)=='e' || inStr.charAt(charInd) =='o' || inStr.charAt(charInd) == 'a' || inStr.charAt(charInd) == 'i') {
				countVowel++;
			}
		}
		double perVowel  = (double) (countVowel*100.00/inStrLen);
		double perDegit = (double) (countDegit*100.00/inStrLen);
		System.out.printf("Number of Vowels: %d (%.2f%%)\n",countVowel,perVowel);
		System.out.printf("Number of Degits: %d (%.2f%%)",countDegit,perDegit);
	}
}
