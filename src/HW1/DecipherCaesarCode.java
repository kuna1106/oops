package HW1;

import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.next().toUpperCase();
		int inStrLen = inStr.length();
		int key = in.nextInt();
		in.close();

		//
		String outStr = "";
		for (int charInd = 0; charInd < inStrLen; charInd++) {
			char unicode = inStr.charAt(charInd);
			if (unicode >= 'A' && unicode <= 'Z') {
				unicode = (char) (unicode - key);
			} else {
				unicode = (char) (unicode - 'A' + 'Z' - 1);
			}
			outStr += unicode;
		}
		System.out.print("the plaintext String: " + outStr);
	}
}
