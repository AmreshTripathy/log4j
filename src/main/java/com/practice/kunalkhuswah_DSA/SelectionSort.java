package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SelectionSort {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		sort(arr);
	}

	private static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int min_index = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			int temp =  arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			printArray(arr);
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
