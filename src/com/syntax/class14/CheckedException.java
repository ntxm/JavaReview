package com.syntax.class14;

import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("Enter a number");
		int a = scan.nextInt();
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		
		
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
			
		}
		
		System.out.println("Please enter another number");
		
		int b = scan.nextInt();
		

	}

}
