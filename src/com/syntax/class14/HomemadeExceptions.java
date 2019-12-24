package com.syntax.class14;

public class HomemadeExceptions {

	public static void main(String[] args) {
		int age1 = 19;
		try {
			checkInformation(age1);
			System.out.println("First user is logged in");
		}catch(AccessDeniedException e) {
			e.printStackTrace();
		}	
			
		int age2 = 16;
		try {
			checkInformation(age2);
			System.out.println("Second user is logged in");
		}catch(AccessDeniedException e) {
			System.out.println("Message --> " + e.getMessage());
			System.out.println("Class --> " + e.getClass());
			//e.printStackTrace();
		}	
		
		System.out.println("============");
		System.out.println("Happy Ending!");
		System.out.println("============");

	}
	
	public static void checkInformation(int age) throws AccessDeniedException {
		if(age < 18) {
			AccessDeniedException ade = new AccessDeniedException("You are under 18");
			throw ade;
		}
	}

}

class AccessDeniedException extends Exception {
	
	public AccessDeniedException() {
		
	}
	
	public AccessDeniedException(String msg) {
		super(msg);
	}
	
	
	
}
