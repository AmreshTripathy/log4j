package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SecondLargestInteger {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		removeDuplicates(arr, 5);
	}
	private static void removeDuplicates(int[] arr, int n) {
		if(n==1 || n==0)
			System.out.println(arr[n-1]);
		
		int count =0;
		int[] temp = new int[n];
		
		for(int i = 0; i< n; i++) {
			if(i+1 < n && arr[i] == arr[i+1]) {
				temp[count] = arr[i];
				i++;
				count++;
			}else {
				temp[count] = arr[i];
				count++;
			}
		}
		System.out.println(temp[count-2]);
	}
}
