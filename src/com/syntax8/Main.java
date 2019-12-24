package com.syntax8;

class Main {
	  
	  
	  void PrintTwice (String word){
	    
	    for (int i = 1; i <= 2; i++){
	      System.out.println(word);
	    }
	  }
	  
	  public static void main(String[] args) {
	    
	    Main obj = new Main();
	    obj.PrintTwice("Don't make me say this twice!");
	    
	  }
	  
	  
	}