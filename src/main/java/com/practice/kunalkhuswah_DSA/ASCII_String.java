package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ASCII_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		covertToAscii(sc.next());
		sc.close();
	}

	private static void covertToAscii(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length()-1; i++) {
			sb.append(str.charAt(i));
			sb.append(str.charAt(i+1) - str.charAt(i));
		}
		sb.append(str.charAt(str.length()-1));
		
		System.out.println(sb.toString());
	}
}
