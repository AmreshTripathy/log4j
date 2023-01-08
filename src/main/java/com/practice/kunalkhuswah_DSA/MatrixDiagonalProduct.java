package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MatrixDiagonalProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.print(diagonalProduct(mat, n));
		sc.close();
	}

	private static long diagonalProduct(int[][] mat, int n) {
		long prod = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j || i+j+1 == n)
					prod *= mat[i][j];
			}
		}
		
		return prod;
	}
}
