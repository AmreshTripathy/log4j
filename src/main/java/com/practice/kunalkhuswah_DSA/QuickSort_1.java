package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class QuickSort_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		quickSort1(arr, 0, n - 1);
		
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	private static void quickSort1(int[] arr, int low, int high) {
		if(low < high) {
			
			int pi = partition(arr, low, high);
			quickSort1(arr, low, pi - 1);
			quickSort1(arr, pi + 1, high);
		}
	}
	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[low];
		
		int i = high;
		
		for(int j = high; j > low; j--) {
			if(arr[j] > pivot) {
				swap(arr, i, j);
				i--;
			}
		}
		
		swap(arr, i, low);
		
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
