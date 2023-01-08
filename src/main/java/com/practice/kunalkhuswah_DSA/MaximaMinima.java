package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MaximaMinima {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matrix[i][j] = sc.nextInt();

		int result = maximaMinima(matrix);
		System.out.println(result);
		sc.close();
	}

	private static int maximaMinima(int[][] matrix) {
		int n = matrix.length;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (check(matrix, i, j))
					return matrix[i][j];
		return -1;
	}

	private static boolean check(int[][] mat, int i, int j) {

		for (int k = 0; k < mat.length; k++) {
			if (j != k && !(mat[i][j] < mat[i][k]))
				return false;
			if (i != k && !(mat[i][j] > mat[k][j]))
				return false;
		}

		return true;
	}
}
