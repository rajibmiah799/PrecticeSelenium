package com.algoridom;

public class FindDupLicate {

	public static void main(String[] args) {
		int [] num = {2, 3,3, 4, 5, 6, 4, 7, 7, 8, 9 };
				//{ 2, 50, 4, 5, 3, 2, 86, 77, 3, 77, 90, 4, 50};
		 
		for(int i =0; i<num.length-1; i ++) {
			if(num[i]==num[i+1]) 
				System.out.println("found duplicate "+num[i]);
			
		}// end for

	}// end main

}// end class
