package com.syntax.class5;

import java.util.Scanner;

public class WhileArray {

	public static void main(String[] args) {
		
		//The size og the array is fixed
		String[] strArray = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		int index = 0;
		String name;
		
		do {
			System.out.println("Enter names, to stop enter stop");
			name = scan.nextLine();
			strArray[index] = name;
			index++;
		}while(index < strArray.length && !name.equals("stop"));

		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}
