package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseAnArrayUsingRecurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		reverseArray(nums, 0, n - 1);
		for (int i=0; i < n; i++)
            System.out.print(nums[i] + " ");
        System.out.println("");
	}

	private static void reverseArray(int[] nums, int i, int j) {
		if(i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			reverseArray(nums, ++i, --j);
		}
	}
}
