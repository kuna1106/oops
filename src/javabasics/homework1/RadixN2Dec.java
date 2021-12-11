package javabasics.homework1;

import java.util.Scanner;

public class RadixN2Dec {
	public static boolean isRadixN(String inStr, int N) {
		for (int i = 0; i < inStr.length(); i++) {
			if (Character.digit(inStr.toLowerCase().charAt(i),N)>0) {
				continue;
			}
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inStr = in.nextLine();
		int strLen = inStr.length();
		int Radix = in.nextInt();
		in.close();
		//
		System.out.println("Enter the String: "+inStr);
		System.out.println("Enter the radix: "+Radix);
		
		//convert RadixN to Dec
		int number = 0;
		int digit;
		if (isRadixN(inStr, Radix) == true) {
			for (int i = 0; i < strLen; i++) {
				digit = Character.digit(inStr.toLowerCase().charAt(i), Radix);
				number += digit*Math.pow(Radix,strLen - 1 - i);
			}
			System.out.printf("The equivalent decimal number '%1$s' is : %2$s",inStr, number);
		} else {
			System.out.printf("Error : invalid RadixN String '%1$s' ",inStr);
		}
	}
}
