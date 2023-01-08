package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class InsertionSort_Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		sortArray(arr);
	}
	
	private static void sortArray(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			
			int key = arr[i];
			
			int j = i - 1;
			
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			
			arr[j + 1] = key;
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
