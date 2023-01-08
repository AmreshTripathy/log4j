package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PairStar {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = sc.next();
		System.out.println(printStar(s, 0, new StringBuilder()));
	}

	private static StringBuilder printStar(String s, int index, StringBuilder sb) {
		
		if(index == s.length()-1) {
			sb.append(s.charAt(index));
			return sb;
		}
		sb.append(s.charAt(index));
		if(s.charAt(index) == s.charAt(index + 1)) {
			sb.append("*");
		}
		
		return printStar(s, index+1, sb);
	}
	
	
	

//	static String camelCase(String s) {
//
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < s.length(); i++) {
//			if ((i+1 < s.length()) && s.charAt(i) == s.charAt(i + 1)) {
//				sb.append(s.charAt(i));
//				sb.append("*");
//			} else {
//				sb.append(s.charAt(i));
//			}
//		}
//
//		return sb.toString();
//	}
}
