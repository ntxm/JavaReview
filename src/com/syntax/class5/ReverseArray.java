package com.syntax.class5;

public class ReverseArray {

	public static void main(String[] args) {
		String[] animals = {"dog", "cat", "mouse", "bird", "horse", "cow"};
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("---reverse---");
		for(int i = animals.length -1; i >= 0; i -- ) {
			System.out.println(animals[i]);
			
		}
		//The last index of the array is one less than the length;
	}

}
