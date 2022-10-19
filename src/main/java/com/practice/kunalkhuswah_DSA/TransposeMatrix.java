package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TransposeMatrix {
	
	protected static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//column and row size of a practice
		int[][] matrix = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
//		System.out.println(Arrays.deepToString(matrix));
		
//		m = matrix.length;
//        n = matrix[0].length;
			
		int[][] rev_matrix = new int[n][m];
        
        for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				rev_matrix[j][i] = matrix[i][j];
			}
		}
	}
}
