package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SumOfTwoArrays {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr_n = new int[n];
		for(int i = 0; i < n; i++)
			arr_n[i] = sc.nextInt();
		
		int[] arr_m = new int[m];
		for(int i = 0; i < m; i++)
			arr_m[i] = sc.nextInt();
		
		int num_n = 0;
		for(int i = 0; i < n; i++) {
			num_n = num_n * 10 + arr_n[i];
		}
		
		int num_m = 0;
		for(int i = 0; i < m; i++) {
			num_m = num_m * 10 + arr_m[i];
		}
		String str = String.valueOf(num_n + num_m).replaceAll("", " ");
		System.out.println(str.trim());
 	}
}
