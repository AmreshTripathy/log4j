package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LargestCoPrimeDivisor {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws java.lang.Exception {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		coPrime(a,b);
	}

	private static void coPrime(int a, int b) {
		int min = Math.min(a, b);
		int num = 1;
		for (int i = 2; i <= min; i++) {
			if (a % i == 0) {
				int min_2 = Math.min(i, b);
				boolean found = false;
				for (int j = 2; j <= min_2; j++) {
					if (b % j == 0 && i % j == 0) {
						found = true;
						break;
					}
				}
				if(!found && (num < i)) {
					num = i;
				}
			}
		}

		System.out.println(num);
	}
}
