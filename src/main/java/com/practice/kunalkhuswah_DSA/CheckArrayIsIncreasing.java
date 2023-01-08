package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CheckArrayIsIncreasing {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int loop_no = sc.nextInt();
		String s;

		for (int i = 0; i < loop_no; i++) {
			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int j = 0; j < n; j++)
				arr[j] = sc.nextInt();

			arrayIncreasing(arr, n);
		}
	}

	private static void arrayIncreasing(int[] arr, int n) {
		
		boolean present = false;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] > arr[i+1]) {
				System.out.println("NO");
				present = true;
				break;
			}
		}
		if(!present)
			System.out.println("YES");
	}
}
