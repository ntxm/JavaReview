package com.syntax.class5;

public class Assign071 {

	public static void main(String[] args) {
		
		 int result;
		 
		    for (int i = 1; i <= 5; i++){ //rows
		      
		      for (int j = 1; j <= 10; j++){ //columns
		        //System.out.print(j + " ");
		        
		    	// if statements started
		        
		    	 
		    	  if(i == 1){  //if 1
		          System.out.print(j + " ");
		        }else if (i == 2){ //if 2
		        	
		        	for(j = 2 ; j < 20; j = j+2) { //for starts
		        	System.out.print(j + " ");
		        	}
		        
		        }else if(i == 3) { // if3
		        	for(j = 3 ; j <= 30; j = j+3) {
			        	System.out.print(j + " ");
		        	}	
		        }else if(i == 4) { // if4
		        	for (j =4; j <= 40; j= j+4) {
		        		System.out.print(j + " ");
		        	}
		        }else if(i == 5) { // if5
		        	for (j =5; j <= 50; j= j+5) {
		        		System.out.print(j + " ");
		        	}
		        }
		        
		      }// end column if
		      
		      System.out.println();
		    }// end rows if
		
		
		
		

	}

}
