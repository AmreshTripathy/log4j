package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaximumDistance {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int max = 0;

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (!set.contains(arr[i])) {
				for (int j = n - 1; j > i; j--) {
					if (arr[i] <= arr[j] && max < (j - i)) {
						max = j - i;
						set.add(arr[i]);
						break;
					}
				}
			}
		}

		System.out.println(max);
	}
}
