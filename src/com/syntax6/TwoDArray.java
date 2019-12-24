package com.syntax6;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[][]b = {
				
				{2, 3, 5},
				{2, 4, 7},
				{8, 1, 9},
				{3, 5, 1}
		};
		
		int max = b[0][0];
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				if(b[i][j] > max) {
					max = b[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
