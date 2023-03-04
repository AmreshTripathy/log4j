package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=60dfe819-2361-404b-850e-6d1166eb6198
 */

import java.util.Scanner;

public class LargestPermutation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i] = sc.nextInt();

        int b =sc.nextInt();
        int [] ans = largestPermutation(A, b);

        sc.close();
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");
    }

    public static int[] largestPermutation(int[] A, int b) {
        //Write your code here
        int n = A.length;
        int[] index = new int[n + 1]; // 1- indexed array

        for (int i = 0; i < n; i++) {
            index[A[i]] = i; // index of A[i] = i
        }

        int i = 0;
        while (i < n && b > 0) {
            int idealValue = n - i;
            if (A[i] != idealValue) {
                int curVal = A[i];
                int cvi = i;
                int ivi = index[idealValue];

                index[curVal] = ivi;
                index[idealValue] = cvi;

                A[i] = idealValue;
                A[ivi] = curVal;
                b--;
            }
            i++;
        }

        return A;
    }
}
