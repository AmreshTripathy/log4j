package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class SumAndProductOfMaximumAndMinimum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int loop_no = sc.nextInt();
		
		for(int i  =  0; i < loop_no; i++) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int j =0; j < n; j++)
				arr[j] = sc.nextInt();
			
			Arrays.sort(arr);
			System.out.print((arr[0] + arr[n-1]) + " " + (arr[0] * arr[n-1]) + "\n");
		}
	}
}
