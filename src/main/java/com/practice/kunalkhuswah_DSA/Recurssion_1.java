package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class Recurssion_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				mat[i][j] = sc.nextInt();
		
		sc.close();
		
		pathPrint(0, 0, n, m, 0, mat, "");
				
	}

	private static void pathPrint(int i, int j, int n, int m, int sum, int[][] mat, String ans) {
		
		if(i == n - 1 && j == m - 1) {
			sum += mat[i][j];
			if(sum % 5 == 0)
				System.out.println(ans);
			return;
		}
		
		if(i >= n || j >= m) return;
		
		pathPrint(i, j + 1, n, m, sum + mat[i][j], mat, ans + "h");
		pathPrint(i + 1, j + 1, n, m, sum + mat[i][j], mat, ans + "d");
		pathPrint(i + 1, j, n, m, sum + mat[i][j], mat, ans + "v");
		
	}
}
