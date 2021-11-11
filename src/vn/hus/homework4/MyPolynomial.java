package vn.hus.homework4;

public class MyPolynomial {
	private double[] coeffs;
	
	public MyPolynomial(double coeffs) {
		this.coeffs[0] = coeffs;
	}
	
	public int getDegree() {
		return coeffs.length;
	}
	
	public String toString() {
		return "";
	}
}
