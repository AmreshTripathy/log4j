package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=1605b6cb-6b60-4bf7-ac4a-8da7cf4bcf1e
 */

import java.util.Scanner;

public class GAMEOFXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ans = xorSubarrayXors(arr, n);
        System.out.print(ans);
        input.close();
    }

    private static int xorSubarrayXors(int[] arr, int n) {

        int res = 0;

        for (int i = 0; i < n; i++) {
            
            // first we calculate the frequency of each element in an array
            int freq = (i + 1) * (n - i);
            // System.out.println(arr[i] + " " + freq);

            // if frequency is odd then we would xor it
            if (freq % 2 == 1)
                res ^= arr[i];

        }

        return res;
    }
}
