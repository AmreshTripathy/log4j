package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SortedInsertPosition {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();

		int B = sc.nextInt();
		System.out.println(searchInsert(A, B));

	}

	public static int searchInsert(int[] a, int b) {
		
		int n = a.length;
		
		if(b < a[0])
			return 0;
		if(b > a[n-1])
			return n;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == b) {
				return i;
			}else {
				if(i+1 < n && a[i] < b && b < a[i+1]) {
					return i+1;
				}
			}
		}
		
		return 0;
	}
}