package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AccioArray {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = splitArray(arr, m);
		System.out.println(ans);
	}
	
	static int splitArray(int[] arr, int m) {
		int n = arr.length;
		int sum_arr1 = 0;
		int sum_arr2 = 0;
		
		for(int i = 0; i < n; i++) {
			if(i < n-m) {
				sum_arr1 += arr[i];
			}else {
				sum_arr2 += arr[i];
			}
		}
        return Integer.max(sum_arr1, sum_arr2);
    }
}
