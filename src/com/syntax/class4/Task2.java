package com.syntax.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
			int price;
			
			
			do {
				System.out.println("Pay for the candy");
				price = scan.nextInt();
				
			}while(price != 3);
			
			System.out.println("Enjoy your candy");
		}
	
	}


