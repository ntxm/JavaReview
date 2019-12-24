package com.syntax.class11;

public class Albanian extends Human {
	
	String albanianID;
	
	public Albanian() {
		
	}
	
	public Albanian(String name, int age, int weight, String albanianID) {
		super(name, age, weight);
		this.albanianID = albanianID;
		
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Congrats!";
	}

	@Override
	public void talk() {
		System.out.println("Talk bla-bla-bla");
		
	}
	
	public void albanianDance() {
		System.out.println("Dancing like an Albanian");
	}
	
	

}
