package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MagicSum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println(magicSum(mat));
	}
	private static int magicSum(int[][] mat) {
		
		int count = mat[0][0] + mat[0][1] + mat[0][2];
		int diagonal_count = 0;
		int anti_diagonal_count =  0;
		
		for(int i = 0; i < 3; i++) {
			int row_count = 0;
			int column_count = 0;
			for(int j = 0; j < 3; j++) {
				row_count += mat[i][j];
				column_count += mat[j][i];
				if(i == j) {
					diagonal_count += mat[i][j];
				}
				if(i+j+1 == 3) {
					anti_diagonal_count += mat[i][j];
				}
			}
			if(count != row_count || count != column_count) {
				return 0;
			}
		}
		if(count != diagonal_count || count != anti_diagonal_count) {
			return 0;
		}
		return count;
	}
}
