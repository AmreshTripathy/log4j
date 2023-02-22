package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e40d0a42-b09e-4fc8-9be8-2d5fb508fdad
 */

import java.util.Scanner;

public class MaximumConsecutiveOnes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxOne(array, n, k));
    }

    private static int maxOne(int arr[], int n, int k) {
        // Here we are using two pointer approach

        int start = 0;

        int countZero = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)
                countZero++;


            // if countZero > k, we are moving start pointer upto countZero == k, then checking the length from
            // that start
            while (countZero > k) {
                if(arr[start] == 0)
                    countZero--;
                start++;
            }

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
