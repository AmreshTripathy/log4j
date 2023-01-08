package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sort(arr);
		sc.close();
	}

	private static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			
			int min_index = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min_index])
					min_index = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
