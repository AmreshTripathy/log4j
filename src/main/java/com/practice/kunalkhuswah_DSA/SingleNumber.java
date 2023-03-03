package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=63605eda-4a6b-438f-826d-9e8225d706c3
 */

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.print(singleElement(A, n));
        sc.close();
    }

    public static int singleElement(int[] arr,int n) {
        int res = 0;

        for (int i = 0; i < n; i++)
            res ^= arr[i];

        return res;
    }
}
