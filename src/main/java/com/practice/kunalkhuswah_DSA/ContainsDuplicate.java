package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ContainsDuplicate {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println(containsDuplicate(arr));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}
}
