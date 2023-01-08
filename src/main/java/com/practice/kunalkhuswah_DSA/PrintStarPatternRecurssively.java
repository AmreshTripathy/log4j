package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintStarPatternRecurssively {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		if(n == 0)
			return;
//		printStar(n);
//		System.out.println();
		printPattern(n-1);
		printStar(n);
		System.out.println();
	}

	private static void printStar(int n) {
		if(n == 0)
			return;
		System.out.print("*");
		printStar(n-1);
	}
}
