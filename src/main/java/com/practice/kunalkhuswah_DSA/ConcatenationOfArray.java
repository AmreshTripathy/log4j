package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ConcatenationOfArray {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		printDouble(arr);
	}

	private static void printDouble(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < 2*n; i++) {
			if(i < n) {
				System.out.print(arr[i] + " ");
			}else {
				System.out.print(arr[i-n] + " ");
			}
		}
	}
}
