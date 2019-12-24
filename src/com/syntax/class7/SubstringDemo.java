package com.syntax.class7;

import java.util.Scanner;

public class SubstringDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy, bevause today is Monday";
		String shortStr = longStr.substring(10);
		System.out.println(shortStr);
		
		shortStr = longStr.substring(10, 30);
		System.out.println(shortStr);
		
	
        char ch = 65;
        System.out.println(ch);
	}

}
