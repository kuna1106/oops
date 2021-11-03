package HW1;

import java.util.Scanner;

public class ExchangeCipher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.next().toUpperCase();
		int inStrLen = inStr.length();
		
		//
		String outStr = "";
		for (int charInd = 0; charInd < inStrLen; charInd++) {
			char plainTextChar = inStr.charAt(charInd); 
			char unicode = (char) ('A' + 'Z'- plainTextChar);
			outStr += unicode;
		}
		System.out.println(" Enter the plaintext String: "+inStr);
		System.out.println(" The ciphertext String: "+outStr);
	}
}
