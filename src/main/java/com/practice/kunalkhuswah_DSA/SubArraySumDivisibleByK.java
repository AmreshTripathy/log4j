package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SubArraySumDivisibleByK {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(sumDivisibleByK(arr, n, k));
	}
	
	private static int sumDivisibleByK(int[] arr, int n, int k) {
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = i; j < n; j++) {
				sum += arr[j];
				if(sum % k == 0)
					count++;
			}
		}
		
		return count;
	}
}
