package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MinimumPathSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] grid = new int[m][n];
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				grid[i][j] = sc.nextInt();
		
		sc.close();
		
		System.out.println(minPathSum(grid));
	}
	
	public static int minPathSum(int[][] grid) {
        return minSum(grid, grid.length - 1, grid[0].length - 1, 0, Integer.MAX_VALUE);
    }

	private static int minSum(int[][] grid, int m, int n, int sum, int min) {
		if(m == 0 && n == 0) {
			sum += grid[m][n];
			min = Math.min(sum, min);
			return min;
		}
		
		if(m < 0 || n < 0) return min;
		
		min = minSum(grid, m - 1, n, sum + grid[m][n], min);
		min = minSum(grid, m, n - 1, sum + grid[m][n], min);
		
		return min;
	}
}
