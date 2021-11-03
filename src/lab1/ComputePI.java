package lab1;

public class ComputePI {
	public static void main(String [] args) {
		int  MAX_TERM = 10000; //try 1000000, 1000,100000
		double sum = 0.0;
		for (int i = 1; i < MAX_TERM; i++) {
			if(i % 2 == 1) {
				sum +=(double) 1/(i*2-1);
			} else {
				sum -=(double) 1/(i*2-1);
			}
		}
		System.out.printf("PI : %f \n", 4 * sum);
		// percents of Math.PI
		System.out.printf("(piComputed/Math.PI)*100 = %.2f \n", 4 * sum / Math.PI);
	}
}
