package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SumOfUpperAndLowerTriangles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		
		printLowerAndUpperTriangleSum(mat, n);
		
		sc.close();
	}

	private static void printLowerAndUpperTriangleSum(int[][] mat, int n) {
		
		int low_sum = 0;
		int upper_sum = 0;
		
		for(int i = 0; i < n; i++) {
			int pos = i;
			for(int j = 0; j < n; j++) {
				if(i <= pos && j <= pos) {
					low_sum += mat[i][j];
				}
				if(i >= pos && j >= pos) {
					upper_sum += mat[i][j];
				}
			}
		}
		
		
		System.out.print(upper_sum + " " + low_sum);
		
	}
}
