package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		printAllPossibleStrings(s, "");
	}

	private static void printAllPossibleStrings(String s, String ans) {
		
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			String modified_s = s.substring(0, i) + s.substring(i + 1);
			
			printAllPossibleStrings(modified_s, ans + ch);
			
		}
		
	}
}
