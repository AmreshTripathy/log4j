package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class GCDUsingRecurssion {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int ans = findGCD(a, b);
		System.out.println(ans);
	}

	static int findGCD(int a, int b) {
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		int n = Math.min(a, b);
		int i = 2;
		int num = 1;
		return gcdNum(i, n, num, a, b);
	}

	static int gcdNum(int i, int n, int num, int a, int b) {
		while (i <= n) {
			if (a % i == 0 && b % i == 0)
				num = i;
			return gcdNum(i+1, n, num, a, b);
		}
		return num;
	}
}
