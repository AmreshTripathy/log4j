package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SerachInsertPosition {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println(searchInsert(arr, sc.nextInt()));
	}
	private static int searchInsert(int[] nums, int k) {
		for(int i = 0; i < nums.length; i++) {
            if(nums[i] == k) {
            	return i;
            }
        }
		Arrays.sort(nums);
		List<Integer> lis = Arrays.stream(nums).boxed().toList();
		
		if(k < lis.get(0)) {
			return 0;
		}
		
		int count = k-1;
		while(!lis.contains(count)) {
			count--;
		}
		
		return lis.indexOf(count) + 1;
	}
}
