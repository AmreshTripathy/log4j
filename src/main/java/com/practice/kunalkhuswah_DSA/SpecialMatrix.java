package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * 
 * GeeksForGeeks: https://practice.geeksforgeeks.org/problems/special-matrix4201/1
 */

import java.util.Arrays;
import java.util.Scanner;

public class SpecialMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int k = sc.nextInt();
		
		int[][] blocked_cells = new int[k][k];
		
		for(int i = 0; i < k; i++) {
			blocked_cells[i][0] = sc.nextInt();
			blocked_cells[i][1] = sc.nextInt();
		}
		sc.close();
		System.out.println(FindWays(n, m, blocked_cells));
	}

	public static int mod = (int)1e9+7; 
	private static int FindWays(int n, int m, int[][] blocked_cells) {
		int[][] dp = new int[n + 1][m + 1];
		
		for(int i = 0; i < n + 1; i++)
			Arrays.fill(dp[i], -1);
		
		return ways(n, m, blocked_cells, dp);
	}

	private static int ways(int n, int m, int[][] blocked_cells, int[][] dp) {
		
		for(int i = 0; i < blocked_cells.length; i++) {
            if(blocked_cells[i][0] == n && blocked_cells[i][1] == m)
                return 0;
        }
        
        if(n == 1 && m == 1){
            return 1;
        }
        
        if(n < 1 || m < 1) return 0;
        
        if(dp[n][m] != -1) return dp[n][m];
        
        int count = 0;
        
        count += ways(n, m - 1, blocked_cells, dp) % mod;
        count += ways(n - 1, m, blocked_cells, dp) % mod;
        
        return dp[n][m] = count % mod;
	}
}
