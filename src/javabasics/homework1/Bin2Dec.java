package javabasics.homework1;

import java.util.Scanner;

public class Bin2Dec {
	public static boolean isBinary(String inStr) {
		for (int charInd = 0; charInd < inStr.length(); charInd++) {
			if (inStr.charAt(charInd)=='1') {
				continue;
			}
			if (inStr.charAt(charInd)=='0') {
				continue;
			}
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.next();
		in.close();
		int strLen = inStr.length();
		
		//
		int number = 0; 
		if (isBinary(inStr)==true) {
			for (int charInd = 0; charInd < strLen; charInd++) {
				 if (inStr.charAt(charInd)=='0') {
					 continue;
				 }
				 number += Math.pow(2, strLen - 1 - charInd);
			}
			System.out.printf( "The equivalent decimal number for binary '%1$s' is: %2$s",inStr,number);
		} else {
			System.out.printf("Erros : invalid binary string '%1$s' ",inStr);
		}
	}
}
