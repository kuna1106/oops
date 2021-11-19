package vn.hus.homework4;

public class MyPolynomial {
	private double[] coeffs;
	
	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	
	public int getDegree() {
		return coeffs.length - 1;
	}
	
	public String toString() {
		int degree = getDegree();
		String str = "";
		for (int i = coeffs.length - 1; i >= 0; i--) {
		    if (degree == 0) {
		         str += coeffs[i];
		         break;
		    }
		    if (degree == 1) {
		         str += coeffs[i] + "x +";
		         degree--;
		         continue;
		    }
		    str += coeffs[i] + "x^" + degree + "+";
		    degree--;
		}
		return str;
	}
}
