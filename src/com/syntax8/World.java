package com.syntax8;

public class World {
	public static void main(String[] args) {
		Baby baby1 = new Baby();
		
		baby1.firstName = "John";
		baby1.lastName = "Doe";
		baby1.gender = 'M';
		baby1.hairColor = "Black";
		baby1.weight = 7;
		
		baby1.walk(7);
		
		
		
		
		Baby baby2 = new Baby();
		baby2.cry();
		
		
		baby2.firstName = "Ann";
		baby2.lastName = "Smith";
		baby2.hairColor = "Black";
		baby2.gender = 'F';
		baby2.weight = 6;
		
		baby2.cry();
		baby2.talk();
		System.out.println(baby2.firstName + " "  + baby2.lastName);
		
		System.out.println("-----------------");
		baby1.displayBabyInfo();
		baby2.displayBabyInfo();
		
	}

}
