package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class StringEncodings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str, 0, "");
        sc.close();
	}
	
	public static String encodings = " abcdefghijklmnopqrstuvwxyz";
	
	public static void printEncodings(String str, int index, String ans) {
        
		if(index == str.length()) {
			System.out.println(ans);
			return;
		}
		
		if(str.charAt(index) == '0') return;
		
		int i = str.charAt(index) - '0';
		printEncodings(str, index + 1, ans + encodings.charAt(i));
		
		if(index < str.length() - 1 && (str.charAt(index) == '1' || (str.charAt(index) == '2' && str.charAt(index + 1) <= '6'))) {
			i = ((str.charAt(index) - '0') * 10) + (str.charAt(index + 1) - '0');
			printEncodings(str, index + 2, ans + encodings.charAt(i));
		}
		
    }
}
