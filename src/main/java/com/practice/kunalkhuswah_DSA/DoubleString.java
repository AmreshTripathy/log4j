package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class DoubleString {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(isDoubleString(sc.next()));
	}
	private static String isDoubleString(String str) {
		str = "abcabc";
		if(str.length() % 2 != 0) {
			return "NO";
		}
		
		int length =str.length();
		
		if(str.equals(str.substring(0, length / 2) + str.substring(length / 2, length))) {
			return "YES";
		}
		
		return "NO";
	}
}
