package com.syntax.class14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		int result = 0;
		int a = 0;
		int b = 0;
		
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		a = scan.nextInt();
		
		System.out.println("Please enter b number:");
		b = scan.nextInt();
		}catch(InputMismatchException inputEx) {
			System.out.println("Please enter a digit");
		}
		
		try {
			
			result = a / b;
		}catch (ArithmeticException ex){
			System.out.println("I couldn't divide " + a + " by " + b);
		}catch(Exception anyEx) {
			System.out.println("Sometning went wrong");
		}
		
		
		System.out.println("The devision result is: " + result);
	}

}
