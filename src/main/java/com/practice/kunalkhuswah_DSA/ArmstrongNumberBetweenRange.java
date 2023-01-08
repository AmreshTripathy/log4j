package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ArmstrongNumberBetweenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArmstrongNumberPrinter(m, n);
	}

	public static void ArmstrongNumberPrinter(int m, int n) {

		for (int i = m; i <= n; i++) {
			int digits = Integer.toString(i).length();
			int num = i;
			int num_1 = num;
			int sum = 0;
			while (num > 0) {
				sum += Math.pow((num % 10), digits);
				num /= 10;
			}

			if (sum == num_1) {
				System.out.print(num_1 + " ");
			}
		}

	}
}
