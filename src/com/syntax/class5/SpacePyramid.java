package com.syntax.class5;

public class SpacePyramid {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 5 - i; j >= 1; j--) {
				
				System.out.print(" ");
			}
			
			for(int m = 1; m <= i; m++) {
				System.out.print(m);
				
			}
			System.out.println(" ");
		}

	}

}
