package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=52a234c6-6674-456c-8671-51a3d15ec96d
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            ArrayList<ArrayList<Integer>> res = subsets(A, n);
            Collections.sort(res, (o1, o2) -> {
                int m = Math.min(o1.size(), o2.size());
                for (int i = 0; i < m; i++) {
                    if (o1.get(i) == o2.get(i)) {
                        continue;
                    } else {
                        return o1.get(i) - o2.get(i);
                    }
                }
                return 1;
            });
            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();

            }
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] arr, int n) {
        // Write your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int limit = (int) Math.pow(2, n);

        for (int i = 0; i < limit; i++) {
            // if (i == 0)
            // continue;

            // ArrayList<Integer> lis = new ArrayList<>();
            // int num = i;
            // int k = 0;
            // while (num > 0 && k < n) {
            // if ((num & 1) > 0)
            // lis.add(arr[k]);

            // num >>= 1;
            // k++;
            // }

            // ans.add(lis);

            // TIME LIMIT EXCEEDED SO ADDING ANOTHER APPROACH
            ArrayList<Integer> lis = new ArrayList<>();
            int temp = i;
            for (int j = n - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 1) {
                    lis.add(arr[j]);
                }
            }
            Collections.reverse(lis);
            ans.add(lis);
        }

        return ans;
    }
}
