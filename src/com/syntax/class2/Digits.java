package com.syntax.class2;

public class Digits {

	public static void main(String[] args) {
		int a = 1000;
		if(a < 100) {
			System.out.println("2 digits");
		}else if(a < 1000) {
			System.out.println("3 digits");
		}else if(a < 10000) {
			System.out.println("4 digits");
		}else {
			System.out.println("Other");
		}

	}

}
