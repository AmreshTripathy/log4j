package com.practice.acciojob;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ValueEqualToTheIndexValue {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		indexValue(arr, n);
	}

	private static void indexValue(int[] arr, int n) {
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (i == arr[i]) {
				System.out.print(i + " ");
				found = true;
			}
		}
		
		if(!found)
			System.out.print(-1 + " ");
	}
}
