package com.syntax.class11;

public class American extends Human {
	String SSN;
	
	public American(String name, int age, int weight, String SSN) {
		super(name, age, weight);
		this.SSN = SSN;
		
	}
	
	public void taxReturns() {
		System.out.println("I am doing my tax return");
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Congratulations!! ^_^";
	}

	@Override
	public void talk() {
		System.out.println("Speak English. My name is " + name);
		System.out.println("My SSN: " + SSN);
		
	}

}
