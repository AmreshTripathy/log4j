package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MinimumSizeSubArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
		sc.close();
		
		System.out.println(minSubArrayLen(target, nums));
	}

		private static int minSubArrayLen(int target, int[] nums) {
			int min = Integer.MAX_VALUE;
			int sum = 0;
			
			int left = 0;
			
			for(int i = 0; i < nums.length; i++) {
				sum += nums[i];
				if(nums[i] == target) return 1;
				
				while(sum >= target) {
					min = Math.min(min, (i - left + 1));
					sum -= nums[left];
					left++;
				}
			}
			
			
			return (min == Integer.MAX_VALUE) ? 0 : min;
		}
}