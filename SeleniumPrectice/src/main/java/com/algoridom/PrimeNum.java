package com.algoridom;

public class PrimeNum {

	public static void main(String[] args) {
		int [] num = {2, 54, 6, 32, 17, 11, 81, 90, 332, 4, 7};
		boolean isPrime = true;
		for(int i =0; i<num.length; i++) {
			for(int j =2; j<num[i]/2; j++) {
				if(num[i] % j == 0) {
					isPrime = false;
					break;
				}// end if
			}// end j
			if(isPrime== false)
				System.out.println(num[i]+ " is not a prime num");
			else
				
				System.out.println(num[i]+ " is a prime num");
			isPrime = true;
		}// end for i

	}// end of main

}// end of class
