package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		quickSort(arr, 0, n - 1);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi -  1);
			quickSort(arr, pi + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		
		int i = (low - 1);
		
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i + 1, high);
		
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
