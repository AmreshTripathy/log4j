package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=faddb193-7416-4426-8c42-99dcd35916a8
 */

import java.util.Scanner;

public class SubArrayProductLessThanK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();

		int k = sc.nextInt();
		sc.close();

		System.out.println(numSubarrayProductLessThanK(nums, k));
		System.out.println(numSubarrayProductLessThanK_TwoPointerApproach(nums, k));
	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			long prod = nums[i];
			if(prod < k) count += 1;
			for(int j = i + 1; j < nums.length; j++) {
				prod *= nums[j];
				if(prod < k) count += 1;
				else break;
			}
		}
		
		return count;
	}

	private static int numSubarrayProductLessThanK_TwoPointerApproach(int[] nums, int k) {
		int len = 0;

		if (k == 0)
			return 0;

		int start = 0;
		int prod = 1;

		for (int i = 0; i < nums.length; i++) {
			prod *= nums[i];

			while (prod >= k) {
				prod /= nums[start];
				start++;
			}

			len += i - start + 1;
		}
		return len;
	}
}
