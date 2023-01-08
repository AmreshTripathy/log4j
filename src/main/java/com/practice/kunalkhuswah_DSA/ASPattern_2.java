package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ASPattern_2 {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		patternPrint(n);
	}

	private static void patternPrint(int n) {

		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}

	}
}
