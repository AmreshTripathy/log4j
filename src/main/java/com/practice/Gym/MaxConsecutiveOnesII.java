package com.practice.Gym;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3605e680-e23b-4a26-aa72-35d2589b59a7
 */

import java.util.Scanner;

public class MaxConsecutiveOnesII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        scan.close();
        System.out.print(longestOnes(arr, k));
    }

    private static int longestOnes(int[] arr, int k) {
        // Sliding Window
        int i = 0, j = 0, n = arr.length;

        int max = 0;
        int count = 0;

        while (j < n) {
            if (arr[j] == 0)
                count++;

            while (count > k) {
                if (arr[i] == 0)
                    count--;
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}
