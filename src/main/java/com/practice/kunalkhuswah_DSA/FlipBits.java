package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class FlipBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		System.out.print(maxOne(arr, n));
	}

	private static int maxOne(int[] arr, int n) {
		int countOne = 0;
		int countZero = 0;
		
		int count = 1;
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == 1) {
				countOne++;
			}else if(arr[i] == 0 && arr[i+1] == 0) {
				count++;
			}else {
				countZero = Math.max(count, countZero);
				count = 1;
			}
		}
		
		return countOne + countZero;
	}
}
