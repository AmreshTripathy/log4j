package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class IslandPerimeter {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				mat[i][j] = sc.nextInt();
		
		System.out.println(perimeter(mat, n, m));
	}
	
	private static int perimeter(int[][] mat, int n, int m) {
//		int islands = 0, neighbours = 0;
		
		int perimeter = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(mat[i][j] == 1) {
					perimeter += 4;
					if(i > 0 && mat[i-1][j] == 1)
						perimeter -= 2;
					if(j > 0 && mat[i][j-1] == 1)
						perimeter -= 2;
				}
			}
		}
		
		return perimeter;
//		return islands * 4 - neighbours * 2;
	}
}
