package com.syntax.class5;

import java.util.Scanner;

public class ArrayMaximum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey bdy, tells us the size of array");
		int size = scan.nextInt();
		int[] array = new int[size];
		
		
		for(int i = 0; i < size; i++) {
			System.out.println(i);
		}

	}

}
