package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PrintArrayRecursively {
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
		printFromStart(arr, i, n);
	}

	private static void printFromStart(int[] arr, int i, int n) {
		if (i != n) {
			System.out.print(arr[i] + " ");
			printFromStart(arr, ++i, n);
		}
	}
}
