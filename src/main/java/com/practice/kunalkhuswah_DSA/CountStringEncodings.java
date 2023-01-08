package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CountStringEncodings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    sc.close();
	    System.out.println(countEncodings(str, 0, "", 0));
	}
	
	public static String encodings = " abcdefghijklmnopqrstuvwxyz";

	private static int countEncodings(String str, int index, String ans, int count) {
		if(index == str.length()) {
//			System.out.println(ans);
			return count + 1;
		}
		
		if(str.charAt(index) == '0') return count;
		
		int i = str.charAt(index) - '0';
		count = countEncodings(str, index + 1, ans + encodings.charAt(i), count);
		
		if(index < str.length() - 1 && (str.charAt(index) == '1' || (str.charAt(index) == '2' && str.charAt(index + 1) <= '6'))) {
			i = (str.charAt(index) - '0') * 10 + (str.charAt(index + 1) - '0');
			count = countEncodings(str, index + 2, ans + encodings.charAt(i), count);
		}
		
		return count;
	}
}
