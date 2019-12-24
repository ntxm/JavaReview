package com.syntax.class5;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		
		//read the array from scanner
		// create an array of numbers
		//insert values of numbers from scanner
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("How many numbers do you want to enter?");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter number " + i);
			array[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+ " ");
			sum += array[i];
			
		}
		System.out.println();
		System.out.println("The sum is " + sum);
	}

}
