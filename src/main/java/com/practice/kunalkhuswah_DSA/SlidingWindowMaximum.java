package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		slidingWindowMaximum(n, k, nums);
	}

	private static void slidingWindowMaximum(int n, int k, int[] arr) {

		for (int i = 0; i < n; i++) {
			int max_1 = arr[i];
			if (i + k -1 < n) {
				for (int j = i; j < i + k; j++) {
					if (max_1 < arr[j])
						max_1 = arr[j];
				}
			}else {
				break;
			}
			System.out.print(max_1 + " ");
		}
	}
}
