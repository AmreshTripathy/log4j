package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class StringEncodings_Practice2 {
	
	public static String encodings = " abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str, 0, "");
        sc.close();
	}

	private static void printEncodings(String str, int i, String ans) {
		
		if(i == str.length()) {
			System.out.println(ans);
			return;
		}
		
		if(i > str.length()) return;
		
		int index = str.charAt(i) - '0';
		
		printEncodings(str, i + 1, ans + encodings.charAt(index));
		
		if(i < str.length() - 1 && (str.charAt(i) == '1' || (str.charAt(i) == '2') && (str.charAt(i + 1) <= '6'))) {
			index = (str.charAt(i) - '0') * 10 + (str.charAt(i + 1) - '0');
			printEncodings(str, i + 2, ans + encodings.charAt(index));
		}
	}
}
