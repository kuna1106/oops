package HW1;

import java.util.Scanner;

public class Hex2Dec {
	public static boolean isHex(String inStr) {
		for (int charInd = 0; charInd < inStr.length(); charInd++) {
			if (Character.digit(inStr.toLowerCase().charAt(charInd),16)>0) {
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
		if (isHex(inStr)==true) {
			for (int charInd = 0; charInd < strLen; charInd++) {
				digit = Character.digit(inStr.toLowerCase().charAt(charInd),16);
				number +=digit*Math.pow(16, strLen - 1 - charInd);
			}
			System.out.printf("The equivalent decimal number for hexadecimal '%1$s' is %2$s",inStr,number);
		} else {
			System.out.printf("error: invalid hexadecimal string '%1$s'",inStr);
		}
	}
}
