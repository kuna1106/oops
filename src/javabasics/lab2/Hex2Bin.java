package javabasics.lab2;

import java.util.Scanner;

public class Hex2Bin {
	public static final String [] HEX_BITS = {"0000", 
			"0001", "0010", "0011", "0100", "0101",
			"0110", "0111", "1000", "1001", "1010",
			"1011", "1100", "1101", "1110" , "1111"};
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
		in.close();
		System.out.println("Enter a Hex String: "+inStr);
		System.out.print("The equidvalent bin for hex is: ");
		if (isHex(inStr) == true) {
			for (int i = 0; i < inStr.length(); i++) {
				int j = Character.digit(inStr.toLowerCase().charAt(i), 16);
				System.out.printf("%1$s ",HEX_BITS[j]);
			}
		}
		System.out.println();
	}
}
