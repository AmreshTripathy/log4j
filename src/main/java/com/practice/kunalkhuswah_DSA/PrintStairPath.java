package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PrintStairPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		reachTheStair(n, 0,"");
		
		System.out.println();
		// below function is repetation of above function
		reachTheStair_instructor(n, "");
	}

	private static void reachTheStair(int n, int i, String num) {
		if(i == n) {
			System.out.println(num);
			return;
		}
		
		if(i > n)
			return;
		
		reachTheStair(n, i+1, num+1);
		reachTheStair(n, i+2, num+2);
		reachTheStair(n, i+3, num+3);
		
	}
	
	private static void reachTheStair_instructor(int n, String str) {
		if(n == 0) {
			System.out.println(str);
			return;
		}
		
		if(n > 0)
			reachTheStair_instructor(n-1, str+ "1");
		if(n > 1)
			reachTheStair_instructor(n-2, str+ "2");
		if(n > 2)
			reachTheStair_instructor(n-3, str+ "3");
		
	}
}
