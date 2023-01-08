package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(longestCount(arr, n));
	}

	private static int longestCount(int[] arr, int n) {

		int count = countLength(arr, n, 0, 0, Integer.MIN_VALUE, new ArrayList<Integer>());

		return count;
	}

	private static int countLength(int[] arr, int n, int index, int max, int previosNumber, List<Integer> lis) {

		if (index <= arr.length) {
//			System.out.println(lis);
			max = Math.max(max, lis.size());
		}

		if (index == arr.length) {
			return 0;
		}

		for (int i = index; i < arr.length; i++) {
			if (previosNumber < arr[i]) {
				lis.add(arr[i]);
				max = countLength(arr, n, i + 1, max, arr[i], lis);
				lis.remove(lis.size() - 1);
			}
		}

		return max;
	}
}
