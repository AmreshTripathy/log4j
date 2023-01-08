package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ASPattern {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		patternPrint(n);
	}
	private static void patternPrint(int n) {
		
		int count = 1;
//		String a = String.valueOf(count);
//		String b = (new StringBuilder(a)).reverse().toString();
//		if(a.equals(b))
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= count; j++) {
				System.out.print(count);
			}
			count += 2;
			System.out.println();
		}
		
	}
}
