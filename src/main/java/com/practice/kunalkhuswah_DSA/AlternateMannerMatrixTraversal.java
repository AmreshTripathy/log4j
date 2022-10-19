package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AlternateMannerMatrixTraversal {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		traversalMatrix(mat, n, m);
	}

	private static void traversalMatrix(int[][] mat, int n, int m) {
		
		String s = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					s += mat[i][j] + " ";
				}
			}else {
				for (int j = m -1; j >= 0; j--) {
					s += mat[i][j] + " ";
				}
			}
		}
		System.out.println(s.trim());
	}
}
