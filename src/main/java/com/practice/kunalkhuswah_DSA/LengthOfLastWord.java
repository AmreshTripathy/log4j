package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LengthOfLastWord {
	protected static Scanner sc = new Scanner(System.in);
	
	public static int lengthOfLastWord(String s) {
		String[] words = s.trim().split(" ");
		return words[words.length-1].length();
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(sc.nextLine()));
	}
}
