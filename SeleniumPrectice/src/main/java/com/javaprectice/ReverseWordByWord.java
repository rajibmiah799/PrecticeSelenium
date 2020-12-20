package com.javaprectice;

import java.util.Arrays;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String s = "I love java language";
		String[] word = s.split("\\s");
		// "\\s" means space or " " and one space between double code

		 System.out.println(Arrays.toString(word));// --- for see that sentence divided
		 //[I, love, java, language]
		String re =" ";
		for (int i = 0; i <word.length; i++) {
			//1st = intial condition, 2nd = stop condition, 3rd = increment or decriment
			String words = word[i];
			String reverse = "";
			for (int j = words.length() - 1; j >= 0; j--) {
				reverse += words.charAt(j);
			}
			re += reverse+" ";
		}
		System.out.println(re);
	}

}
