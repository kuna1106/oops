package javabasics.homework1;

import java.util.Scanner;

public class TestPalindromicPhrase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String phrase = in.nextLine();
		int strLen = phrase.length();
		in.close();
		
		//
		String leftStr = "";
		String rightStr = "";
		int fIdx = 0 ;
		int bIdx = strLen - 1 ;
		while ( fIdx < bIdx ) {
			if (phrase.toLowerCase().charAt(fIdx) >= 'a' && phrase.toLowerCase().charAt(fIdx) <= 'z') {
				leftStr +=phrase.toLowerCase().charAt(fIdx);
			}
			if (phrase.toLowerCase().charAt(bIdx) >= 'a' && phrase.toLowerCase().charAt(bIdx) <= 'z') {
				rightStr +=phrase.toLowerCase().charAt(bIdx);
			}
		++ fIdx;
		-- bIdx;
		}
		if (leftStr.equals(rightStr)) {
			System.out.printf(" %1$s is palindrome.\n ", phrase);
		} else {
			System.out.printf(" %1$s is not palindrome.\n ", phrase);
		}
	}
}
