package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SubarraySumEqualsK_Leetcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        sc.close();
        
        System.out.println(LongestSubArraywithSumK(k,nums));
	}

	private static int LongestSubArraywithSumK(int k, int[] nums) {
		int count = 0;
		
		count = sumEqualSubArray(0, nums, k, count);
		
		return count;
	}

	private static int sumEqualSubArray(int index, int[] nums, int k, int count) {
		if(index == nums.length)
			return count;
		
		int sum = 0;
		
		for(int j = index; j < nums.length; j++) {
			sum += nums[j];
			if(sum == k)
				count += 1;
		}
		count = sumEqualSubArray(index + 1, nums, k, count);
		
		return count;
	}
}
