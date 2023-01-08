package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CamelCase {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String ans = camelCase(s);
			System.out.println(ans);
		}
	}

	static String camelCase(String s) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '_') {
				sb.append((s.charAt(i+1)+"").toUpperCase());
				i++;
			}else {
				sb.append(s.charAt(i));
			}
		}
		
		return sb.toString();
	}
}
