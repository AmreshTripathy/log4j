package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RowWithMaximum1 {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m =  sc.nextInt();
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				mat[i][j] = sc.nextInt();
		
		checkMaxOne(mat, n, m);
	}
	
	private static void checkMaxOne(int[][] mat, int n, int m) {
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < m; j++) {
				if(mat[i][j] == 1)
					count++;
			}
			if(max < count) {
				max = count;
				index = i;
			}
		}
		
		System.out.println(index);
	}
}
