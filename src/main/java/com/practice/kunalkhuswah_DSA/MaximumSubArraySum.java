package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaximumSubArraySum {

	protected static Scanner sc = new Scanner(System.in);
	
	public static int maxSum(int[] arr) {
		
		int size = arr.length;
		
		int maxSum = 0;
		int minSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < size; i++) {
			maxSum += arr[i];
	         if (minSum < maxSum) {
	        	 minSum = maxSum;
	         }
	         if (maxSum < 0) {
	        	 maxSum = 0;
	         }
		}
		
		return minSum;
	}
	
	public static void main(String[] args) throws java.lang.Exception{
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxSum(arr));
		
	}
}
