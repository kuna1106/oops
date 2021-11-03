package HW1;

import java.util.Scanner;

public class RevertString {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String inStr;
		int inStrLen;
		
		// compt and read input
		inStr = in.next();
		inStrLen = inStr.length();
		in.close();
		// using inStr.charAt(index) in a loop extract a character 
		// Character index begins 0 from left
		// process  the String from right   
		for (int charInd = inStrLen -1 ; charInd >= 0; charInd --) {
			System.out.print(inStr.charAt(charInd));
		}
	}
}
