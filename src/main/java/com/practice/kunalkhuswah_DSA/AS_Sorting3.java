package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AS_Sorting3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		ASsort3(array, n);
	}

	private static void ASsort3(int arr[], int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
	}
}
