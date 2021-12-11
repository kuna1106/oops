package oops.homework4;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;
	
	public MyComplex() {
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return real + "+" + imag + "i";
	}
	
	public boolean isReal() {
		if (imag == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isMaginary() {
		if (real == 0) {
			return true;
		}
		return false;
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	
	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double argument() {
		return Math.atan2(real, imag);
	}
	
	
	public MyComplex add(MyComplex right) {
		this.real += right.real;
		this.imag += right.imag;
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		double someReal = this.real + right.real;
		double someImag = this.imag + right.imag;
		return new MyComplex(someReal,someImag);
	}
	
	public MyComplex subtract(MyComplex right) {
		this.real = this.real - right.real;
		this.imag = this.imag - right.imag;
		return this;
	}
	
	public MyComplex subtractNew(MyComplex right) {
		double someReal = this.real - right.real;
		double someImag = this.imag - right.imag;
		return new MyComplex(someReal,someImag);
	}
	
	public MyComplex multiply(MyComplex right) {
		this.real = this.real * right.real;
		this.imag = this.imag * right.imag;
		return this;
	}
	
	 public MyComplex divide(MyComplex right) {
        this.real = this.real / right.real;
        this.imag = this.imag / right.imag;
        return this;
    }

	 public MyComplex conjugate() {
        this.real = -this.real;
        this.imag = -this.imag;
        return this;
	 }
}
