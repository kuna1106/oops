package lab1;

public class CheckPassFail {
	public static void main(String [] args) {
		int [] mark = {0,49,50,51,100};//set the value of 'mark'
		for (int i : mark) {
			// if-else statement
			if(i >= 50) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
		System.out.println("DONE");
  }
}
