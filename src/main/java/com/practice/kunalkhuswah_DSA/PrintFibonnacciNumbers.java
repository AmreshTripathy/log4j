package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintFibonnacciNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int count = 0;
		int i = 0;
		int j = 1;
		int num = 0;
		scn.close();
		fib(count, n, i, j, num);
	}

	private static void fib(int count, int n, int i, int j, int num) {
		if (count == 0) {
			System.out.println(i);
			count += 1;
			if (count <= n)
				fib(count, n, i, j, num);
		} else if (count == 1) {
			System.out.println(j);
			count += 1;
			if (count <= n)
				fib(count, n, i, j, num);
		} else {
			num = i + j;
			i = j;
			j = num;
			count += 1;
			System.out.println(num);

			if (count < n)
				fib(count, n, i, j, num);
		}
	}
}
