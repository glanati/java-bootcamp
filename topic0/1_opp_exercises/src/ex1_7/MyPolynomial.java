package ex1_7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyPolynomial {
	
	private double[] coeffs;
	
	public MyPolynomial (double... coeffs) {
		this.coeffs = coeffs;
	}
	
	public MyPolynomial(String filename) {
		   Scanner in = null;
		   try {
		      in = new Scanner(new File(filename));  // open file
		   } catch (FileNotFoundException e) {
		      e.printStackTrace();
		   }
		   int degree = in.nextInt();      // read the degree
		   coeffs = new double[degree+1];  // allocate the array
		   for (int i=0; i<coeffs.length; ++i) {
		      coeffs[i] = in.nextDouble();
		   }
		}
	
/*	
	public String toString() {
		return "MyPolynomial [coeffs=" + Arrays.toString(coeffs) + "]";			
	}
*/	
	public String toString() {
		return "cnx^n+cn-1x^(n-1)+...+c1x+c0";
	}
/*
	public int getDegree() {
		
	}
	
	public double evaluate(double x) {
		
	}
	
	public MyPolynomial add(MyPolynomial another) {
		
	}
	
	public MyPolynomial multiply(MyPolynomial another) {
		
	}
*/
}
