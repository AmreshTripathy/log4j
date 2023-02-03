package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=d929410d-8057-4937-9384-8f6c8c634fea
 */

import java.util.Scanner;

public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        printFirstNegativeInteger(arr, n, k);
    }

    private static void printFirstNegativeInteger(int[] arr, int n, int k) {

        // flag to check whether window contains
        // a negative integer or not
        boolean flag;

        // Loop for each subarray(window) of size k
        for (int i = 0; i < (n - k + 1); i++) {
            flag = false;

            // traverse through the current window
            for (int j = 0; j < k; j++) {
                // if a negative integer is found, then
                // it is the first negative integer for
                // current window. Print it, set the flag
                // and break
                if (arr[i + j] < 0) {
                    System.out.print((arr[i + j]) + " ");
                    flag = true;
                    break;
                }
            }

            // if the current window does not
            // contain a negative integer
            if (!flag)
                System.out.print("0" + " ");
        }
    }

}
