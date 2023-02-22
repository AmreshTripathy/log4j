package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6724980a-4f60-46df-acc1-7f0144f12959
 */

import java.util.Scanner;

public class CountPairSum_2_Arrays {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        int x = input.nextInt();
        input.close();
        System.out.println(countElements(arr1, arr2, m, n, x));
    }

    public static int countElements(int[] arr1, int[] arr2, int m, int n, int x) {
        int count = 0;

        // using two ponter wher left is starting of arr1 and right is end of arr2
        int left = 0, right = n - 1;

        while (left < m && right >= 0) {
            
            int sum = arr1[left] + arr2[right];

            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
