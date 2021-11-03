package HW1;

import java.util.Scanner;

public class TestPalindromicWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		in.close();

		String revertWord = "";
		for (int charInd = word.length() - 1; charInd >= 0; charInd--) {
			revertWord += word.toLowerCase().charAt(charInd);
		}
		if (word.toLowerCase().equals(revertWord.toLowerCase())) {
			System.out.printf(" %1$s is palindrome.\n ", word);
		} else {
			System.out.printf(" %1$s is not palindrome.\n ", word);
		}
	}
}
