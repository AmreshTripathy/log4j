package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c11892f3-ca35-4a9f-81b2-1e1e81b25797
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DistributionOfCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println(candies(arr, n));
        sc.close();
    }

    public static int candies(ArrayList<Integer> A, int n) {
        // Write code here
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // lets satisfy the left condition (if we are having > rating than left neighbour)
        for (int i = 1; i < n; i++) {
            if (A.get(i) > A.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // right condition

        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) > A.get(i + 1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int total = 0;
        for (int x : candies)
            total += x;

        return total;
    }
}
