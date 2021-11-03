package lab1;

public class Fibonacci {
	public static void main(String [] args) {
		int TnMinus1 = 1; // T(1) = 1
		int TnMinus2 = 1; // T(2) = 1
		int TnMinus3 = 2; // T(3) = 2
		int Tn = TnMinus1 + TnMinus2 + TnMinus3;
		int nMax = 20;
		System.out.println("Tribonaci " + nMax + " Series: ");
		System.out.print(TnMinus1 + "\t" + TnMinus2 + "\t" + TnMinus3);
		for (int i = 4; i < nMax; i++) {
			System.out.print("\t" + Tn);
			TnMinus1 = TnMinus2;
			TnMinus2 = TnMinus3;
			TnMinus3 = Tn;
			Tn = TnMinus1 + TnMinus2 + TnMinus3;
		}
		System.out.println();
	}
}
