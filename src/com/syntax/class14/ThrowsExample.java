package com.syntax.class14;

public class ThrowsExample {

	public static void main(String[] args) {
	
		try {
		int res = divide(10,0);
		System.out.println("Result is " + res);
		}catch(Exception ex) {
			System.out.println("Division by zero in Main method");
			System.out.println(ex);
		}
		
		System.out.println("=============");
		System.out.println("Happy Ending!");
		System.out.println("=============");
		

	}
	
	public static int divide(int a, int b) throws Exception {
	
		int result = 0;
		
		try {
			result = a/b;
		}catch(Exception e) {
			System.out.println("Division by zero in Divide method");
			throw e;
		}
		
		return result;
		
	}

}
