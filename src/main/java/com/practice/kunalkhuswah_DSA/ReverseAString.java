package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseAString {
	
	protected static Scanner sc = new Scanner(System.in);
	public static void reverseString(char[] s) {
		String s1=new String(s);
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		sb.toString(); 
		sb.getChars(0,s1.length(),s,0);
		System.out.print(sb.toString());
	}
	
	public static void main(String[] args) {
		reverseString(sc.next().toCharArray());
	}
}
