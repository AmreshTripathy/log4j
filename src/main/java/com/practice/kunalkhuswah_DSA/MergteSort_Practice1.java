package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MergteSort_Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		
		mergeSort(arr, 0, n - 1);
		System.out.println();
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			
			int m = l + (r - l) / 2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			
			merge(arr, l, m, r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		
		for(int i = 0; i < n2; i++) {
			right[i] = arr[m + 1 + i];
		}
		
		int i = 0, j = 0, k = l;
		
		while(i < n1 && j < n2) {
			if(left[i] <= right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		
		while(i < n1)
			arr[k++] = left[i++];
		
		while(j < n2)
			arr[k++] = right[j++];
	}
}
