package com.syntax.class14;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 0;
		int c = 0;
		
		try {
			c = a/b;
		}catch (Exception e){
			
			System.out.println("Exception: " + e);
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("Continue running after exception");
		System.out.println(c);
		System.out.println("Happy Ending!");

	}

}
