package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MultiplyArrayElements {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print(multiply(arr, n-1));
	}

	private static int multiply(int[] arr, int n) {
		if(n == 0)
			return arr[n];
		else {
			return arr[n] * multiply(arr, n-1);
		}
	}
}
