package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class FlipFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        int a = flipFlip(n, arr, k);
        System.out.println(a + " ");
    }

    private static int flipFlip(int n, int[] arr, int k) {
        
        return 0;
    }
}
