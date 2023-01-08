package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ProductOfArrayExcecptSelf {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		long ans[] = ProductOfArrayExceptSelf(n, nums);
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static long[] ProductOfArrayExceptSelf(int n, int[] a) {
//		long[] arr = new long[n];
//		int prod = 1;
//		boolean foundZero = false;
//		int index = 0;
//		for (int i = 0; i < n; i++) {
//			if (a[i] != 0) {
//				prod *= a[i];
//			} else {
//				foundZero = true;
//				index = i;
//			}
//		}
//
//		if (foundZero) {
//			arr[index] = prod;
//		} else {
//			for (int i = 0; i < n; i++) {
//				arr[i] = prod / a[i];
//			}
//		}
//
//		return arr;
		
		long[] ans = new long[a.length];
        int left = 1;
        
        for (int i = 0; i < a.length; i++) {
            ans[i] = left;
            left *= a[i];
        }
        
        int right = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= a[i];
        }
        
        return ans;
	}
}
