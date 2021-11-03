package lab1;

public class HamornicSum {
	public static double printSumL2R(int n) {
		double sum = 0.0;
		for (int i = 1; i <=n; i++ ) {
			sum += (double) 1/i;
		}
		System.out.printf("Left to right harmonic sum :%f \n",sum);
		return sum;
	}
	public static double printSumR2L(int n) {
		double sum = 0.0;
		for (int i = n; i >= 1; i--) {
			sum += (double ) 1/i;
		}
		System.out.printf("Right to left harmonic sum :%f \n",sum);
		return sum;
	}
	public static void main(String [] args) {
		final int MAX_DENOMINATOR = 50000;
		double sumL2R = printSumL2R(MAX_DENOMINATOR);
		double sumR2L = printSumR2L(MAX_DENOMINATOR);
		System.out.printf("absolute difference: %f " ,(sumL2R-sumR2L));
		// two sums have not difference
	}
}
