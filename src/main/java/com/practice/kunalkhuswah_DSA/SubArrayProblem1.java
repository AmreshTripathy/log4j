package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SubArrayProblem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		System.out.println(solve(arr, n, s));
	}

	private static String solve(int[] arr, int n, int s) {
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0 ;
			for(int j = 0; j < n; j++) {
				if(i+j == arr.length)
					return "NO";
				sum += arr[i+j];
			}
			
			if(sum == s)
				return "YES";
		}
		return "NO";
	}
}
