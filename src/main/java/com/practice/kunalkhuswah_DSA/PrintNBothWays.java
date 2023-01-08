package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PrintNBothWays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printN(n);
	}

	private static void printN(int n) {
		if(n == 0)
			return;
		System.out.println(n);
		printN(n-1);
		System.out.println(n);
	}
}
