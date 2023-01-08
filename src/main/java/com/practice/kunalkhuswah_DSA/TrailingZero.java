package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TrailingZero {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		System.out.println(trailingZero(n));
	}

	private static int trailingZero(int n) {
		if (n < 0) 
            return -1;
        int count = 0;
 
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
 
        return count;
	}
}
