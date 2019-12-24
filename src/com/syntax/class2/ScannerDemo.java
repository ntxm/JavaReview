package com.syntax.class2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		//String name;
		Scanner keyBInput = new Scanner(System.in);
		// command + shift + o;
		
		System.out.println("Enter your name");
		String name = keyBInput.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = keyBInput.nextLine();
		
		System.out.println("Your name is " + name);
		System.out.println("Your last name is " + lastName);
		
		
		// Scanner 2 
		
		Scanner PersonalData = new Scanner(System.in);
		
		System.out.println("Enter you First name: ");
		String fName = PersonalData.nextLine();
		
		System.out.println("Enter you Last name: ");
		String lName = PersonalData.nextLine();
		
		System.out.println("Enter you Age: ");
		int age = PersonalData.nextInt();
		
		System.out.println("Enter you price per hour: ");
		double price = PersonalData.nextDouble();
		
		System.out.println("Hello, " + fName + " " + lName + "!");
		System.out.println("You are " + age + " years old and");
		System.out.println("Your price is " + price + "p/h");
		System.out.println("Good Luck. Hope, you will find a job very soon.");
		
		//Scanner 3
		
		Scanner checkGender = new Scanner(System.in);
		System.out.println("Are you male: true or false");
		boolean isMale = checkGender.nextBoolean();
		
		if(isMale) {
			System.out.println("You are male");
		}else {
			System.out.println("You are not male");
		}
	}

}
