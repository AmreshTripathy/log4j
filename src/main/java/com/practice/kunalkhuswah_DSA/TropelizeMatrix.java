package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TropelizeMatrix {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int m, n;
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] A = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(isToeplitzMatrix(A, m, n));
	}

	public static boolean isToeplitzMatrix(int[][] matrix, int m, int n) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int element = matrix[i][j];
				if (!set.contains(element)) {
					int row = i + 1;
					int column = j + 1;
					while (row < m && column < n) {
						if (matrix[row][column] != element) {
							return false;
						}
						row++;
						column++;
					}
					set.add(element);
				}
			}
		}

		return true;
	}
}
