package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RotateAMatrixBy90Degree {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		int[][] r_matrix = new int[m][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		r_matrix = rotateBy90(matrix, n, m);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(r_matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] rotateBy90(int[][] matrix, int n, int m) {

		int[][] r_matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				r_matrix[j][n - 1 - i] = matrix[i][j];
			}

		}

		return r_matrix;
	}
}
