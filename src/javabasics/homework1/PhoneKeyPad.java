package javabasics.homework1;

import java.util.Scanner;

public class PhoneKeyPad {
	public static void main(String [] args) {
		StringBuffer outStr = new StringBuffer("");
		Scanner in = new Scanner(System.in);
		String inStr = in.next().toLowerCase();
		int inStrLen = inStr.length();
		in.close();
		int number = 0;
		
		// for loop
		for (int charInd = 0; charInd < inStrLen; charInd++) {
			char anphabet = inStr.charAt(charInd);
			if (anphabet == 'a' || anphabet == 'b' || anphabet == 'c') {
				number = 2;
			} else if (anphabet == 'd' || anphabet == 'e' || anphabet == 'f') {
				number = 3;
			} else if (anphabet == 'g' || anphabet == 'h' || anphabet == 'i') {
				number = 4;
			} else if (anphabet == 'j' || anphabet == 'k' || anphabet == 'l') {
				number = 5;
			} else if (anphabet == 'm' || anphabet == 'n' || anphabet == 'o') {
				number = 6;
			} else if (anphabet == 'p' || anphabet == 'q' || anphabet == 'r' || anphabet == 's') {
				number = 7;
			} else if (anphabet == 't' || anphabet == 'u' || anphabet == 'v') {
				number = 8;
			} else if (anphabet == 'w' || anphabet == 'x' || anphabet == 'y' || anphabet == 'z') {
				number = 9;
			} else {
				outStr = new StringBuffer("invalid input");
				break;
			}
			outStr.append(number);
		}
		System.out.println(outStr);
	}
}
