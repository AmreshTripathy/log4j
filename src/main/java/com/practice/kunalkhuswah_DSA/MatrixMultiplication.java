package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MatrixMultiplication {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int loop = sc.nextInt();
		while(loop-- > 0) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int[][] b = new int[n][n];
			
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					b[i][j] = sc.nextInt();
			
			multiply(a,b,n);
		}
	}
	
	private static void multiply(int[][] a, int[][] b, int n) {
//		int[][] output = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int sum = 0;
				for(int k = 0; k < n; k++) {
					sum += (a[i][k] * b[k][j]);
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(output[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
