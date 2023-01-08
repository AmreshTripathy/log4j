package com.practice.acciojob;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SmallerThanTripletSum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int k = sc.nextInt();
		
		System.out.println(countTripletSum(arr, n, k));
	}
	
	private static int countTripletSum(int[] arr, int n, int k) {
		int count = 0;
		
//		for(int i = 0; i < n; i++) {
////			int sum = arr[i];
//			for(int j = i+1; j < n && j+1 < n; j++) {
//				int sum = arr[i] + arr[j] + arr [j+1];
//				if(sum < k) {
//					count++;
//				}
//			}
//		}
		
		return count;
	}
}
