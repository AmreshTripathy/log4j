package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SubArraySumEqualsK {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int k = sc.nextInt();
		
		System.out.println(countSubArraySumEqualsK(arr, n, k));
	}
	
	private static int countSubArraySumEqualsK(int[] arr, int n, int k) {
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = arr[i];
			if(sum == k)
				count++;
			for(int j = i+1; j < n; j++) {
				sum += arr[j];
				if(sum == k)
					count++;
			}
		}
		return count;
	}
}
