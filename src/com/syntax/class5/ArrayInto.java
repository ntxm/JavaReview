package com.syntax.class5;

public class ArrayInto {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		a[2] = 7;
		a[4] = 9;
		a[0] = 4;
		
		int sumOfArray = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
			sumOfArray = sumOfArray + a[i];
		}
		System.out.println();
		System.out.println(sumOfArray);
		
		
		// serious 2nd way
		
		int[] b = {4, 0, 7, 0, 9};
		int sumB = 0;
		
		for(int i = 0; i < b.length; i++) {
			
			sumB = sumB + b[i];
			
		}
		System.out.println(sumB);
		System.out.println("-----------");
		
		

	}

}
