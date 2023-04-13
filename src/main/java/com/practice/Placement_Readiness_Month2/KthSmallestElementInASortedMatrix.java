package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ca1bfbb8-a8f1-4736-9dac-578e50615064
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
 */

import java.util.Scanner;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int k = sc.nextInt();
        sc.close();

        System.out.println(kthSmallest(matrix, k));
    }

    private static int kthSmallest(int[][] matrix, int k) {
        // Using Binary Search method to find exact kth smallest element

        int n = matrix.length;

        int lo = matrix[0][0];
        int hi = matrix[n - 1][n - 1];

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int elementsLessThanOrEqualToMid = getElementsLessThanOrEqualToMid(matrix, n, mid);

            if (elementsLessThanOrEqualToMid >= k) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    private static int getElementsLessThanOrEqualToMid(int[][] matrix, int n, int target) {

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] > target) {
                // if any row's first value is greater than target we return the count of
                // elemnts that are less
                return ans;
            } else if (matrix[i][n - 1] <= target) {
                // if a row's last element is less than or equal to target we add that row
                // length
                ans += n;
            } else {
                // there can be third case like a element can be positioned at mid like 1 2 3 4
                // no. less than 3 are 1 2 3
                int lo = 0;
                int hi = n - 1;
                int temp = 0;

                while (lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if (matrix[i][mid] <= target) {
                        temp = mid;
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }

                ans += temp + 1;
            }
        }

        return ans;
    }
}
