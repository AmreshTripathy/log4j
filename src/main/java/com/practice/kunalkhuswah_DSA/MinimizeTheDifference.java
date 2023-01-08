package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MinimizeTheDifference {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws java.lang.Exception {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int dif = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] <= k && ((arr[i] + k) >= 0)) {
				arr[i] = arr[i] + k;
			} else if((arr[i] + k) >= 0) {
				arr[i] = arr[i] - k;
			}
		}

		Arrays.sort(arr);
		dif = arr[n - 1] - arr[0];

		System.out.println(dif);
	}
}
