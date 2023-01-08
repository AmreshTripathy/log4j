package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ArmstrngNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;

		int sum = 0;
		while (n > 0) {
			sum += Math.pow((n % 10), 3);
			n /= 10;
		}

		if (sum == num) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
