package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMatrixZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				mat[i][j] = sc.nextInt();

		printMatrix(mat, n, m);

		int[][] matrix = rearrangeMatrix(mat, n, m);

		printMatrix(matrix, n, m);

		sc.close();
	}

	private static int[][] rearrangeMatrix(int[][] mat, int n, int m) {

		Set<Integer> row = new HashSet<Integer>();
		Set<Integer> column = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 0) {
					row.add(i);
					column.add(j);
				}
			}
		}

		for(int k: row) {
			changeRowWise(mat,  m, k);
		}
		
		for(int k: column) {
			changeColumnWise(mat,  n, k);
		}
		
		return mat;
	}

	private static void changeRowWise(int[][] mat, int m, int pos) {
		for (int k = 0; k < m; k++) {
			mat[pos][k] = 0;
		}
	}

	private static void changeColumnWise(int[][] mat, int n, int pos) {

		for (int k = 0; k < n; k++) {
			mat[k][pos] = 0;
		}

	}

	private static void printMatrix(int[][] mat, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
