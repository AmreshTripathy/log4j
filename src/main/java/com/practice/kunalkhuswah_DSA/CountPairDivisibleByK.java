package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CountPairDivisibleByK {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(CountPairs(arr, k));
	}
	
	public static long CountPairs(int[] arr, int k) {
		long count = 0;
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1;  j < n; j++) {
				if((arr[i] + arr[j]) % k == 0) {
					count++;
				}
			}
		}
		
        return count;
    }
}
