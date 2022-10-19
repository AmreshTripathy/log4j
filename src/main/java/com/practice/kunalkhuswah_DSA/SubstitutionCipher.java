package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SubstitutionCipher {

	protected static Scanner sc = new Scanner(System.in);
	
	static void cipher(String input) {
		String output = "";
		
		for(char ch: input.toCharArray()) {
			output += Integer.toString(ch -65);
		}
		
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		try {
			String input = sc.next();
			cipher(input);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
