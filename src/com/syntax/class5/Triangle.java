package com.syntax.class5;

public class Triangle {

	public static void main(String[] args) {
	
		for (int row = 1; row < 6; row++) {
			
			for(int column = 1; column <= row; column++) {
				//System.out.print(2 * column - 1);
				System.out.print(column * column +  " ");
			
			}
			System.out.println(" ");
		}
	
		System.out.println("-----------------");
		
		for(int i=1; i<=10; i++){
		     System.out.print(i+" ");}
		     System.out.println();
		   for (int j=1; j<=20; j++){
		     if(j%2==0){
		       System.out.print(j+" ");}}
		       System.out.println();
		   for(int k=3; k<=30; k++){
		     if(k%3==0){
		       System.out.print(k+" ");}
		   }
		   System.out.println();
		   for(int g=4; g<=40; g++){
		     if(g%4==0){
		       System.out.print(g+" ");
		     }
		   }
		   System.out.println();
		   for(int h=5 ; h<=50; h++){
		     if(h%5==0){
		     System.out.print(h+" ");}
		   }
		   }
		

	}


