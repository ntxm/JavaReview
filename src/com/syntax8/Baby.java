package com.syntax8;

public class Baby {
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	void talk() {
		System.out.println("Bla bla bla");
	}
	
	void walk(int times) {
		for(int i = 0; i < times; i++) {
			System.out.println("Crawl");
		}
		
	}
	
	void cry() {
		System.out.println("Cry every minute");
	}
	
	void displayBabyInfo() {
		System.out.println("Full name is " + firstName + " " + lastName);
		System.out.print("Gender is ");
		if(gender == 'M') {
			System.out.println("Male");
		}else if (gender == 'F') {
			System.out.println("Female");
		}else {
			System.out.println("Unknown");
		}
	}
	

}
