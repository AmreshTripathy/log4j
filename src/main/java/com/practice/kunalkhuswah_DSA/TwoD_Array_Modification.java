package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TwoD_Array_Modification {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int k = sc.nextInt();

		int[][] mat = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				mat[i][j] = sc.nextInt();

		int count = 0;
		while (count < k) {
			mat = modifiedArray(mat, n, m);
			count++;
		}
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				System.out.print(mat[i][j] + " ");
		
	}

	private static int[][] modifiedArray(int[][] mat, int n, int m) {
		
		int[][] temp_mat = new int[n][m];
		
		for(int x1 = 0; x1 < n; x1++) {
			for(int y1 = 0; y1 < m; y1++) {
				int count = 0;
				int sum = 0;
				for(int x2 = 0; x2 < n; x2++) {
					for(int y2 = 0; y2 < m; y2++) {
						if(Math.abs(x2-x1) + Math.abs(y2-y1) == 1) {
							count++;
							sum += mat[x2][y2];
						}
					}
				}
				temp_mat[x1][y1] = sum / count;
			}
		}
		return temp_mat;
	}
}
