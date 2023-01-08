package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPractice {
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
		
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			
			int j = i -1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
