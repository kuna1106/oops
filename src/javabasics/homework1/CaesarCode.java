package javabasics.homework1;

import java.util.Scanner;

public class CaesarCode {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.next().toUpperCase();
		int key = in.nextInt();
		int inStrLen = inStr.length();
		in.close();
		
		String outStr ="";
		System.out.println(" Enter a plaintext String : "+inStr);
		System.out.println(" Enter the key: "+key);
		
		for (int charInd = 0; charInd < inStrLen; charInd++) {
			char unicode =inStr.charAt(charInd);
			if (unicode >= 'A' && unicode <='Z') {
				unicode = (char)(unicode+key);
			} else {
				unicode = (char)(unicode-'A'+'Z'-1);
			}
			outStr +=unicode;
		}
		System.out.print(" The ciphertext Sting: "+outStr);
	}
}
