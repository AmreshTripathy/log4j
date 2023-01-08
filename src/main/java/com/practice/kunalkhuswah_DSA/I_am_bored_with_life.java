package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class I_am_bored_with_life {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        System.out.print(factorial((int) Math.min(a, b)));
	}

	private static long factorial(int n) {
		return (n == 0 || n == 1) ? 1 : n * factorial(n-1);
	}
}
