package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SmallestGreaterElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		
		greaterElement(arr, n);
		sc.close();
	}

	private static void greaterElement(int[] arr, int n) {
		
	
		for(int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < n; j++) {
				if(arr[j] > arr[i] && arr[j] < min) {
					min = arr[j];
				}
			}
			if(min ==  Integer.MAX_VALUE) {
				System.out.print("-10000000 ");
			}else {
				System.out.print(min + " ");
			}
			min =  Integer.MAX_VALUE;
		}
		
	}
}
