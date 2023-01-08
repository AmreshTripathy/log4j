package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AlternateSignedNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		isAlternate(arr, n);
		sc.close();
	}

	private static void isAlternate(int arr[], int n) {
		boolean pos = false;

		if (arr[0] >= 0)
			pos = true;

		if (pos) {
			for (int i = 0; i < n; i += 2) {
				if (arr[i] < 0) {
					System.out.println("No");
					return;
				}
				if (i + 1 < n && arr[i + 1] > 0) {
					System.out.println("No");
					return;
				}
			}
		} else {
			for (int i = 0; i < n; i += 2) {
				if (arr[i] > 0) {
					System.out.println("No");
					return;
				}
				if (i + 1 < n && arr[i + 1] < 0) {
					System.out.println("No");
					return;
				}
			}
		}

		System.out.println("Yes");
	}
}
