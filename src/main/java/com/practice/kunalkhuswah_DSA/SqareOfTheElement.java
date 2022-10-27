package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SqareOfTheElement {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			arr[i] = (int) Math.pow(arr[i], 2);
		}
		
		Arrays.sort(arr);
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
