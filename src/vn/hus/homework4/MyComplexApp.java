package vn.hus.homework4;

import java.util.Scanner;

public class MyComplexApp {
	public static void main(String[] args) {
        // Enter data by user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double realPart1 = in.nextDouble();
        double imagPart1 = in.nextDouble();
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double realPart2 = in.nextDouble();
        double imagPart2 = in.nextDouble();
        
        in.close();
        // Create objects
        MyComplex myComplex1 = new MyComplex(realPart1, imagPart1);
        MyComplex myComplex2 = new MyComplex(realPart2, imagPart2);

        // Check number 1 is real and imaginary
        System.out.println("\nNumber 1 is: " + myComplex1);
        checkIfItIsReal(myComplex1);
        checkIfItIsImaginary(myComplex1);
        // Check number 2 is real and imaginary
        System.out.println("\nNumber 2 is: " + myComplex2);
        checkIfItIsReal(myComplex2);
        checkIfItIsImaginary(myComplex2);

        // Check if numbers are equal
        checkIfItIsEquals(myComplex1, myComplex2);

        // Check another equal
        System.out.println(myComplex1.equals(realPart1, imagPart1));

        // Count magnitude()
        System.out.println(myComplex1.magnitude());

        // Count sum of them
        System.out.println(myComplex1 + " + " + myComplex2 + " = " + myComplex1.addNew(myComplex2));

        // Check addInto
        System.out.println(myComplex1 + " + " + myComplex2 + " = " + myComplex1.add(myComplex2));
    }

    public static void checkIfItIsReal(MyComplex myComplex) {
        if (myComplex.isReal()) {
            System.out.println(myComplex + " is a pure real number");
        } else {
            System.out.println(myComplex + " is NOT a pure real number");
        }
    }

    public static void checkIfItIsImaginary(MyComplex myComplex) {
        if (myComplex.isReal()) {
            System.out.println(myComplex + " is a pure imaginary number");
        } else {
            System.out.println(myComplex + " is NOT a pure imaginary number");
        }
    }

    public static void checkIfItIsEquals(MyComplex myComplex1, MyComplex myComplex2) {
        if (myComplex1.equals(myComplex2)) {
            System.out.println(myComplex1 + " is equal to " + myComplex2);
        } else {
            System.out.println(myComplex1 + " is NOT equal to " + myComplex2);
        }
    }
}