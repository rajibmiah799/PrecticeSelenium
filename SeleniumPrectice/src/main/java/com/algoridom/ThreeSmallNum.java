package com.algoridom;

public class ThreeSmallNum {

	public static void main(String[] args) {
		int [] num = { 10, 51, 69, 87, 98, 43, 64 };
		int min1 = 100000;
		int min2 = 100000;
		int min3 = 100000;
		
		 for (int i= 0; i<num.length; i++) {
			 if (num[i] < min1 ) {
				 min3 = min2;
				 min2 = min1;
				 min1 = num[i];
			 }else if( num[i] <min2) {
				 min3 = min2;
				 min2= num[i];
				 
			 }else if(num[i]< min3){
				 min3= num[i];
			 }// end of if
		 }// end of for
		 System.out.println("min one is "+min1);
		 System.out.println("min two is "+min2);
		 System.out.println("min three is "+min3);
		

	}

}
