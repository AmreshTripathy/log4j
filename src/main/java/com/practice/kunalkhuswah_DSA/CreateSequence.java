package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CreateSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 2; i <= n; i++) {
			int num = i;
			boolean isContains = false;
			if (containsTwoAndFiveOnly(num, isContains)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean containsTwoAndFiveOnly(int n, boolean isContains) {
		if (n > 0) {
			if (n % 10 == 2 || n % 10 == 5) {
				isContains = true;
				return isContains ? containsTwoAndFiveOnly(n / 10, isContains) : false;
			} else {
				return false;
			}
		}
		return isContains;
	}
}
