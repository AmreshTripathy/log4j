package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class GalaxyOfStars {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i <= n / 2) {
				for(int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(int j = n-i-1; j >= 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
