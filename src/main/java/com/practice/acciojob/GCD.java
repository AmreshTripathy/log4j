package com.practice.acciojob;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class GCD {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b);
		int gcd = 1;
		for(int i = 2; i <= min; i++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}
}
