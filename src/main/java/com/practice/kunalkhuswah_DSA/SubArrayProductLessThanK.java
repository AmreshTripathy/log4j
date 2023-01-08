package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SubArrayProductLessThanK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();
		sc.close();

		System.out.println(numSubarrayProductLessThanK(nums, k));
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

	
}
