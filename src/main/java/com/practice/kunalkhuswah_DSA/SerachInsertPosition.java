package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/search-insert-position/description/
 */

import java.util.Scanner;

public class SerachInsertPosition {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println(searchInsert(arr, sc.nextInt()));
	}
	private static int searchInsert(int[] nums, int k) {
		int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] == k)
                return mid;
            else if(nums[mid] < k)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
		// if it's unable to find the k element then we remove the lo index
        return lo;
	}
}
