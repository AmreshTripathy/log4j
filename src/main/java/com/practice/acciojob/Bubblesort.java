package com.practice.acciojob;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Bubblesort {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		arr = sortArray(arr, n);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private static int[] sortArray(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}
}
