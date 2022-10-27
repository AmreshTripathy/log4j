package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class FindPeakElement {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findPeakElement(arr));
	}

	public static int findPeakElement(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count = i;
			}
		}
		if (count > 0 && count < nums.length - 1) {
			return 1;
		}
		return 0;
	}
}
