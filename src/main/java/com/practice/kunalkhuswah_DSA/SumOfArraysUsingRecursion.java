package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SumOfArraysUsingRecursion {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		PrintArray(arr, n);
	}

	public static void PrintArray(int[] arr, int n) {
		int i = 0;
		int sum = 0;
		sum = printFromStart(arr, i, n, sum);
		System.out.print(sum);
	}

	private static int printFromStart(int[] arr, int i, int n, int sum) {
		if (i != n) {
			sum += arr[i];
			sum = printFromStart(arr, ++i, n, sum);
		}
		return sum;
	}
}
