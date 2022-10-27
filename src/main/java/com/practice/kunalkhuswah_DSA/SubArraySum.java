package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SubArraySum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(longestLength(arr, n));
	}
	
	private static int longestLength(int[] arr, int n) {
		int max_length = 0;
		
		for(int i = 0; i < n; i++) {
			int mix_sum = 0;
			for(int j = i; j < n; j++) {
				mix_sum += arr[j];
				if(mix_sum == 0 && max_length < (j - i + 1)) {
					max_length = j - i + 1;
				}
			}
		}
		
		return max_length;
	}
}
