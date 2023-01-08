package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SecondLargestInteger {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(removeDuplicates(arr, n));
	}

	private static int removeDuplicates(int[] arr, int n) {
		if(n == 0)
			return 0;
//
//		HashSet<Integer> set = new HashSet<Integer>();
//		int count = 0;
//		int[] temp = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			if (i + 1 < n && arr[i] == arr[i + 1] && !set.contains(arr[i])) {
//				temp[count] = arr[i];
//				set.add(arr[i]);
//				i++;
//				count++;
//			} else {
//				if (!set.contains(arr[i])) {
//					temp[count] = arr[i];
//					set.add(arr[i]);
//					count++;
//				}
//			}
//		}
//		System.out.println(temp[count - 2]);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[n - 1]) {
				return arr[i];
			}
		}
		return arr[n - 1];
	}
}
