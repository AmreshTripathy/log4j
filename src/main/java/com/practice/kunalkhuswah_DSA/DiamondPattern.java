package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class DiamondPattern {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp = m;
		for (int i = 0; i < m; i++) {
			if (n <= m) {
				for(int j = m-n; j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < n; j++) {
					System.out.print("* ");
				}
				n += 2;
			}else {
				temp -= 2;
				for(int j = 0; j < m-temp; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < temp; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
