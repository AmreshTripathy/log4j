package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintSubsequenceOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		printSubSequence(str, "", 0);
	}

	private static void printSubSequence(String str, String ans, int i) {
		if(str.length() == i) {
			System.out.println(ans);
			return;
		}
		
		printSubSequence(str, ans + str.charAt(i), i+1);
		printSubSequence(str, ans, i+1);
	}
}
