package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class NextMaximum {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int[] ans = nextMaximum(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] nextMaximum(int[] A, int n) {

		int[] arr = new int[n];
		arr[n-1] = -1;
		
		for (int i = 0; i < n-1; i++) {
			boolean found = false;
			for(int j = i+1; j < n; j++) {
				if(A[i] < A[j]) {
					arr[i] = j-i;
					found = true;
					break;
				}
			}
			
			if(!found)
				arr[i] = -1;
		}
		
		return arr;
	}
}
