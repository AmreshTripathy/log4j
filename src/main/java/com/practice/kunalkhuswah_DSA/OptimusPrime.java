package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class OptimusPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findPrimesUntilN(n);
	}

	static void findPrimesUntilN(int n) {
		for (int i = 2; i <= n; i++) {
			boolean found = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println(i);
		}
	}
}
