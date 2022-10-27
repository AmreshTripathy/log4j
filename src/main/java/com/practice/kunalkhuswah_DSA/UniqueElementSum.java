package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class UniqueElementSum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int n = sc.nextInt();
		boolean present = false;
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i != j && arr[i] == arr[j]) {
					present = true;
				}
			}
			if (!present) {
				sum += arr[i];
			}
			present = false;
		}

		System.out.println(sum);
	}
}
