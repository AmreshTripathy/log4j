package com.practice.coinswitch;

public class SquareSubmatrices {
    public static int countSubmatrices(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        // Create a prefix sum matrix
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        // Count submatrices
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int size = 1; size <= Math.min(m - i + 1, n - j + 1); size++) {
                    int sum = dp[i + size - 1][j + size - 1] - dp[i - 1][j + size - 1] - dp[i + size - 1][j - 1]
                            + dp[i - 1][j - 1];
                    if (sum > k) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int k = 8;
        System.out.println("Number of square submatrices with sum > " + k + ": " + countSubmatrices(matrix, k));
    }
}
