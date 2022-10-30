package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MergeSortedArray {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] first_arr = new int[n];
		for(int i = 0; i < n; i++)
			first_arr[i] = sc.nextInt();
		
		int[] second_arr = new int[m];
		for(int i = 0; i < m; i++)
			second_arr[i] = sc.nextInt();
		
		int[] result = new int[m+n];
		System.arraycopy(first_arr, 0, result, 0, n);
		System.arraycopy(second_arr, 0, result, n, m);
		Arrays.sort(result);
		
		for(int i = 0; i < n+m; i++)
			System.out.printf(result[i] + " ");
	}
}
