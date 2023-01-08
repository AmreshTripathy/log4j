package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaximumOfArray {
	protected static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result = maxElement(nums);
        System.out.print(result);
	}
	
	public static int maxElement(int[] arr){
		int n = arr.length;
		int ele = Integer.MIN_VALUE;
		ele = checkMax(arr, n, ele);
		return ele;
    }

	private static int checkMax(int[] arr, int n, int ele) {
		if(n >= 1) {
			ele = (int) Math.max(ele, arr[n-1]);
			ele = checkMax(arr, --n, ele);
		}
		return ele;
	}
}
