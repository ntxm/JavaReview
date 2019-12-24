package com.syntax.class11;

public abstract class Human {
	
	String name;
	int age;
	int weight;
	
	public Human() {
		//super();-- this is done by default
		System.out.println("A human being is created.");
	}
	
	public Human(String name) {
		this();
		System.out.println("The name of that person is " + this.name);
		this.name = name;
		System.out.println("The name of that person is " + this.name);

	}
	
	public Human(String name, int age, int weight) {
		//super(); -- this is done by default

		this(name);
		this.age = age;
		this.weight = weight; 
	}
	
	public abstract String greeting(); 
	
	public abstract void talk(); 

}
