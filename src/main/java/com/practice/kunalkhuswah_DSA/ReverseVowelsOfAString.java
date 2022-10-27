package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseVowelsOfAString {
	protected static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(reverseVowels(sc.next()));
	}
	
	private static String reverseVowels(String str) {
		
		String vowel_string = "";
		List<Character> lis =  Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		for(int i = str.length() - 1; i >= 0; i--) {
			if(lis.contains(str.charAt(i))) {
				vowel_string += str.charAt(i);
			}
		}
		
		int count = 0;
		StringBuilder str_builder = new StringBuilder(str);
		for(int i = 0; i < str.length(); i++) {
			if(lis.contains(str.charAt(i))) {
				str_builder.setCharAt(i, vowel_string.charAt(count));
				count++;
			}
		}
		
		return str_builder.toString();
	}
}
