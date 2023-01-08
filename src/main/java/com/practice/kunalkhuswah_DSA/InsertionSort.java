package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class InsertionSort {
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
		System.out.print("Main Array: ");
		printArray(arr);
		System.out.println();
		for(int i = 1; i < n; i++) {
			/* storing current element before swapping by checking is there any
			 * greater element before that postioned element.
			*/
			int key =  arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j]; // shiftting the element to their next postion
				j = j - 1;
				printArray(arr);
			}
			
			arr[j + 1] = key;
			printArray(arr);
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
