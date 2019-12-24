package com.syntax8;

public class Application {
	public static void main(String[] args) {
		
		//create object (MathOperations class)
		MathOperations mathOps = new MathOperations();
		
		//sum
		int result = mathOps.add(3, 4, 5);
		System.out.println("the result is " + result);
		
		
		//substract
		mathOps.substract(10, 5);
		
		//multiply
		mathOps.multiply(40, 2);
		
		//division
		double result1 = mathOps.divide(50, 10);
		double result2 = mathOps.divide(10, 0);
		
		int i = mathOps.multiply2(3.4, 2);
		System.out.println(i);
	}

}
