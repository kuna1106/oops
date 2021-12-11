package javabasics.homework2;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[][] matrix1 = new int[number][number];
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				matrix1[i][j] = in.nextInt();
			}
		}
		
		int[][] matrix2 = new int[number][number];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				matrix2[i][j] = in.nextInt();
			}
		}
		in.close();
		//
		print(matrix1);
		add(matrix1, matrix2);
		subtract(matrix1, matrix2);
		multiply(matrix1, matrix2);
	}

	public static void print(int[][] matrix) {
		if (matrix == null) {
			return;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
				;
			}
			System.out.println();
		}
	}

	public static void print(double[][] matrix) {
		if (matrix == null) {
			return;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
				;
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
		if (matrix1 == null || matrix2 == null) {
			return false;
		}
		if (matrix1.length == matrix2.length) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
		if (matrix1 == null || matrix2 == null) {
			return false;
		}
		if (matrix1.length == matrix2.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int[][] add(int[][] matrix1, int[][] matrix2){
		int[][] result =  new int[matrix1.length][matrix1.length];
		if (matrix1 == null || matrix2 == null) {
			return null;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	} 
	
	public static double[][] add(double[][] matrix1, double[][] matrix2){
		double[][] result =  new double[matrix1.length][matrix1.length];
		if (matrix1 == null || matrix2 == null) {
			return null;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	} 

	public static int[][] subtract(int[][] matrix1, int[][] matrix2){
		int[][] result = new int[matrix1.length][matrix1.length];
		if (matrix1 == null || matrix2 == null) {
			return null;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return result;
	}
	
	public static double[][] subtract(double[][] matrix1, double[][] matrix2){
		double[][] result = new double[matrix1.length][matrix1.length];
		if (matrix1 == null || matrix2 == null) {
			return null;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return result;
	}

	public static int[][] multiply(int[][] matrix1, int[][] matrix2){
		int[][] result = new int[matrix1.length][matrix1.length];
		if (matrix1 == null || matrix2 == null) {
			return null;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < result.length; k++) {
					result[i][j] +=matrix1[i][k]*matrix2[k][j]; 
				}
			}
		}
		return result;
	}
	
	public static double[][] multiply(double[][] matrix1, double[][] matrix2){
		double[][] result = new double[matrix1.length][matrix1.length];
		if (matrix1 == null || matrix2 == null) {
			return null;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < result.length; k++) {
					result[i][j] +=matrix1[i][k]*matrix2[k][j]; 
				}
			}
		}
		return result;
	}
}
