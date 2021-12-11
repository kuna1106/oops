package oops.homework4;

public class MyComplexTest {
	public static void main(String[] args) {
        // Test Constructor
        MyComplex myComplex = new MyComplex(5.0,5.0);
        System.out.println(myComplex);   // Test toString()
        System.out.println(myComplex.isReal());   // Test isReal()
        System.out.println(myComplex.isMaginary());   // Test Imaginary()
        System.out.println(myComplex.magnitude());   // Test Magnitude()

        MyComplex myComplex2 = new MyComplex(8.5,10.5);
        System.out.println(myComplex.equals(myComplex2));   // Test equals()
        System.out.println(myComplex.equals(5.0,5.0));   // Test equals()
        System.out.println(myComplex.add(myComplex2));   // Test add()
        System.out.println(myComplex.addNew(myComplex2));   // Test addNew()

        // Test Constructor
        MyComplex myComplex3 = new MyComplex();
        System.out.println(myComplex3);
        System.out.println(myComplex.getReal());   // Test Getter
        System.out.println(myComplex.getImag());   // Test Getter
        myComplex.setReal(33.00);   // Test Setter
        myComplex.setImag(23.00);   // Test Setter
        System.out.println(myComplex.getReal());   // Test Getter
        System.out.println(myComplex.getImag());   // Test Getter
        myComplex.setValue(45.00,50.00);    // Test Setter
        System.out.println(myComplex);

        // Test more methods
        MyComplex myComplex7 = new MyComplex(10,10);
        System.out.println(myComplex7.argument());
        System.out.println(myComplex.subtract(myComplex7));
        System.out.println(myComplex.subtractNew(myComplex7));
        System.out.println(myComplex.multiply(myComplex7));
        System.out.println(myComplex.divide(myComplex7));
        System.out.println(myComplex.conjugate());
        System.out.println(myComplex7.conjugate());
    }
}	
