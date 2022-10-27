package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class DiagonalDifference {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		 
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println(diagonalDifference(mat, n));
	}
	private static int diagonalDifference(int[][] mat, int n) {
		
		int left_diagonal_sum = 0;
		int right_diagonal_sum = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					left_diagonal_sum += mat[i][j];
				}
				if(i+j+1 == n) {
					if(!(n/2 == i && n/2 == j)) {
						right_diagonal_sum += mat[i][j];
					}
				}
			}
		}
		
		return right_diagonal_sum + left_diagonal_sum;
	}
}
