package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseWordString_III_1 {
	
	protected static Scanner sc = new Scanner(System.in);
	public static String reverseWords(String s) {
		
		String[] word = s.split(" ");
		for(int i = 0; i < word.length; i++) {
			word[i] = new StringBuilder(word[i]).reverse().toString();
		}
		
		return String.join(" ", word);
	}

	public static void main(String[] args) {
		System.out.println(reverseWords(sc.nextLine()));
	}
}
