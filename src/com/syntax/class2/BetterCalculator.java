package com.syntax.class2;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {
		Scanner calculator = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		int num1 = calculator.nextInt();
		
		System.out.println("Enter the Operator: ");
		String operator = calculator.next();
		
		System.out.println("Enter the second number: ");
		int num2 = calculator.nextInt();
		
		int result;
		
		if(operator.equals("+")) {
			result = num1 + num2;
			System.out.println(result);
		}else if(operator.equals("-")) {
			result = num1 - num2;
			System.out.println(result);
		}else if(operator.equals("/")) {
			result = num1 / num2;
			System.out.println(result);
		}else if(operator.equals("*")) {
			result = num1 * num2;
			System.out.println(result);
			}else {
				System.out.println("Wrong operator");
			}
		}
	}


