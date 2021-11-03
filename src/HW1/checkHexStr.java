package HW1;

import java.util.Scanner;

public class checkHexStr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.next();
		int strLen = inStr.length();
		in.close();
		
		//
		boolean valid = true;
		for (int charInd = 0; charInd < strLen; charInd++) {
			if (!((inStr.charAt(charInd)>='0' && inStr.charAt(charInd) <='9') || (inStr.charAt(charInd)>='a' && inStr.charAt(charInd)<='f') || (inStr.charAt(charInd)>='A' && inStr.charAt(charInd)<='F'))) {
				valid = false;
			} else {
				valid = true;
			}
		}
		if (valid == true ) {
			System.out.printf("%1$s is hex string ",inStr);
		} else {
			System.out.printf("%1$s is not hex string ",inStr);
		}
	}
}
