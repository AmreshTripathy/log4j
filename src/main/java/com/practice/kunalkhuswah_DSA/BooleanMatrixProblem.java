package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class BooleanMatrixProblem {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				mat[i][j] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			boolean found = false;
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 1) {
					found = true;
					break;
				}
			}

			if (found) {
				for (int j = 0; j < m; j++) {
					mat[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
