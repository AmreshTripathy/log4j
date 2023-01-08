package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintNumberPattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	private static void printPattern(int n) {

		int x = 0;
		int y = 1;
		int num = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1)
					System.out.print(x);
				else if (i == 2 && j == 1) {
					System.out.print(y + " ");
				}else {
					num = x + y;
					x = y;
					y = num;
					System.out.print(num + " ");
				}
			}
			System.out.println();
		}
	}
}
