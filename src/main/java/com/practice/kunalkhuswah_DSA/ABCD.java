package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ABCD {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] =  sc.nextInt();
		
		columnMinusRow(mat, n);
	}
	
	private static void columnMinusRow(int[][] mat, int n) {
		for(int i = 0; i < n; i++) {
			int columnSum = 0;
			int rowSum = 0;
			
			for(int j = 0; j < n; j++) {
				rowSum += mat[i][j];
				columnSum += mat[j][i];
			}
			
			System.out.println(columnSum - rowSum);
		}
	}
}
