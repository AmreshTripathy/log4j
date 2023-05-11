package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=d7165d6a-4fcd-42af-aed5-13f8ab4881a2
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinCutTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        input.close();
        int ans = minHeight(a, n, k);
        System.out.println(ans);
    }

    private static int minHeight(int[] height, int n, int k) {

        Arrays.sort(height);
        int min = 0;

        int low = height[0], high = height[n - 1];

        while (low <= high) {
            int mid = (low + high) / 2;

            int x = getCuttedTreeCounts(height, mid, n);

            if (x > k) {
                // increase the height
                low = mid + 1;
            } else {
                // decrease the height
                min = mid;
                high = mid - 1;
            }
        }

        return min;
    }

    private static int getCuttedTreeCounts(int[] height, int mid, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (height[i] > mid)
                sum += height[i] - mid;
        }

        return sum;
    }
}
