package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SpiralMatrix2 {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws java.lang.Exception {

		int n = sc.nextInt(), m = sc.nextInt();

		int[][] matrix = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		spiralTraversalMatrix2(matrix, n, m);

	}

	private static void spiralTraversalMatrix2(int[][] matrix, int n, int m) {
		int left = 0, top = 0, right = m - 1, bottom = n - 1;
		int target = matrix.length * matrix[0].length;
		int count = 0;
//		ArrayList<Integer> lis = new ArrayList<Integer>();

		while (left <= right && top <= bottom) {
			for (int i = top; i <= bottom && count < target; i++) {
				System.out.print(matrix[i][left] + " ");
				count++;
			}
			left++;
			
			for (int i = left; i <= right && count < target; i++) {
				System.out.print(matrix[bottom][i] + " ");
				count++;
			}
			bottom--;
			
			for (int i = bottom; i >= top && count < target; i--) {
				System.out.print(matrix[i][right] + " ");
				count++;
			}
			right--;
			
			for (int i = right; i >= left && count < target; i--) {
				System.out.print(matrix[top][i] + " ");
				count++;
			}
			top++;

			
		}
//		System.out.println(Arrays.toString(lis.toArray()).replace("[", "").replace("]", ""));
	}
}
