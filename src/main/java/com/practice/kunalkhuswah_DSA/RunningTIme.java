package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RunningTIme {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(processCount(arr, n));
	}

	private static int processCount(int[] arr, int n) {
		int count = 0;

		int[] sort_arr = arr.clone();
		Arrays.sort(sort_arr);

		while (!Arrays.equals(sort_arr, arr)) {
			for (int i = 0; i < n; i++) {
				if (i + 1 < n) {
					int pre = arr[i];
					if (arr[i] > arr[i + 1]) {
						arr[i] = arr[i+1];
						arr[i+1] = pre;
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
