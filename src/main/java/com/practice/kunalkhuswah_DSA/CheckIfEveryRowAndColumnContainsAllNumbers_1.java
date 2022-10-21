package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CheckIfEveryRowAndColumnContainsAllNumbers_1 {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println(checkValid(mat));
	}
	
	public static boolean checkValid(int[][] matrix) {
		
		int n = matrix.length;
		
		for (int i = 0; i < n; i++) {
            boolean[] row = new boolean[n+1];
            boolean[] col = new boolean[n+1];

            for (int j = 0; j < n; j++) {
                row[matrix[i][j]] = true;
                col[matrix[j][i]] = true;
            }

            for (int j = 1; j < n+1; j++) {
                if (!row[j] || !col[j]){
                    return false;
                }
            }
        }
		
        return true;
    }
}
