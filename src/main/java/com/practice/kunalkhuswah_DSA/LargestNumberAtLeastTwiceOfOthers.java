package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LargestNumberAtLeastTwiceOfOthers {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		 
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(indexOfLargestNumber(arr, n));
	}
	private static int indexOfLargestNumber(int[] arr, int n) {
		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n && i != j; j++) {
//				if(arr[i] == arr[j]) {
//					return 0;
//				}
//			}
//		}
		
		int[] temp = arr.clone();
		Arrays.sort(temp);
		int largest = temp[n-1];
		
		for(int i = 0; i < n-1; i++) {
			if(!(temp[i] <= largest / 2)) {
				return -1;
			}
		}
		for(int i = 0; i < n; i++)
			if(arr[i] == largest)
				return i;
		
		return -1;
	}
}
