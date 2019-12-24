package com.syntax.class3;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// Write a program with one int value for salary and four String values for
		// different cars
		// If you make over 50000 a year, you may buy a brand new car otherwise you
		// should buy a used car.
		// For those you can afford a new car there are different price ranges
		// I want anything under 70k to be Audi A5
		// I want anything under 80k to be Mercedes-Benz
		// I want anything under 90k to be Jaguar
		// I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until
		// next year"

		int salary;
		// String audi, mercedes, jaguar, tesla;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your salary?");
		salary = scan.nextInt();

		if (salary > 50000) {
			if(salary <= 60000) {
				System.out.println("Save up money and wait until next year");
			}else if (salary <= 70000) {
				System.out.println("I want anything under 70k to be Audi A5");
			} else if (salary <= 80000) {
				System.out.println("I want anything under 80k to be Mercedes-Benz");
			} else if (salary <= 90000) {
				System.out.println("I want anything under 90k to be Jaguar");
			} else if (salary <= 100000) {
				System.out.println("I want anything under 100k to be Tesla");
		} else {
			System.out.println("You can buy a used car");
		}
		}
	}

}
