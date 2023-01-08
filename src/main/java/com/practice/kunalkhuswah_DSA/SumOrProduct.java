package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SumOrProduct {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.close();

		if (q == 1) {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.print(sum);
		} else if (q == 2) {
			long prod = 1;
			for (int i = 1; i <= n; i++) {
				prod *= i;
				prod %= 1000000007;
			}
			System.out.print(prod);
		}
	}
}
