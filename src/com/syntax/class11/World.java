package com.syntax.class11;

public class World {

	public static void main(String[] args) {
		
		//Human person1 = new Human("Andrey");
		//Human person2 = new Human("Salim", 25, 150);
		
		System.out.println("-----America----");
		Human person3 = new American("John", 42, 150, "111-22-333");
		person3.talk();
		//casting
		American americanPerson = (American) person3;
		americanPerson.taxReturns();
		
		System.out.println("-----Albanian----");
		Human person4 = new Albanian();
		person4.talk();
		Human person5 = new Albanian("Ann", 20, 120, "BR345678");
		person5.talk();
		Albanian albanianPerson = (Albanian)person5;
		albanianPerson.albanianDance();
		
		
		System.out.println("The world ended");
	}

}
