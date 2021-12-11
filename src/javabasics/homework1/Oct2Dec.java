package javabasics.homework1;

import java.util.Scanner;

public class Oct2Dec {
	public static boolean isOct(String inStr) {
		for (int charInd = 0; charInd < inStr.length(); charInd++) {
			if (Character.digit(inStr.toLowerCase().charAt(charInd),8)>0) {
				continue;
			}
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.next();
		int strLen = inStr.length();
		in.close();
		
		//
		int number = 0;
		int digit;
		if (isOct(inStr)==true) {
			for (int i = 0; i < strLen; i++) {
				digit = Character.digit(inStr.toLowerCase().charAt(i), 8);
				number +=digit*Math.pow(8, strLen - 1 - i);
			}
			System.out.printf("the equivalent decimal number '%1$s' is : %2$s ",inStr,number);
		} else {
			System.out.printf("error: invalid octa string '%1$s'",inStr);
		}
	}
}
