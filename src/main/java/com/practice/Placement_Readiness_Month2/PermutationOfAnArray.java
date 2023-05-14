package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8c618d7a-c4f1-446b-997d-dd400359f88c
 */

import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];

        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            B[i] = sc.nextInt();

        sc.close();
        System.out.println(solve(A, B, n));
    }

    private static int solve(int[] A, int[] B, int n) {

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        int count = 0;

        while (i < n && j < n) {
            if (A[i] > B[j]) {
                i++;
                j++;
                count++;
            } else {
                i++;
            }
        }

        return count;
    }
}
