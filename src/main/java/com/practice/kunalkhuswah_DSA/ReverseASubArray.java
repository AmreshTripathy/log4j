package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseASubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		sc.close();
		
		if(reverseSubArray(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

	private static boolean reverseSubArray(int[] arr, int n) {
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] > arr[i+1]) {
				for(int j = i; j < n-1; j++) {
					if(arr[j] < arr[j+1]) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
