package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=017e582a-b0ac-4ee7-9ac9-9ed5d954ee46
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BSTQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> preorder = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            preorder.add(sc.nextInt());
        }
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> ans = bstQueries(preorder, q, queries);
        for (Integer x : ans) {
            System.out.println(x);
        }
    }

    public static ArrayList<Integer> bstQueries(ArrayList<Integer> preorder, int q, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(preorder);
        System.out.println(preorder);
        for (int i = 0; i < q; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (preorder.get(preorder.size() - 1) < left) {
                ans.add(0);
                continue;
            }

            int l = findLeftIndex(preorder, left);
            int r = findRightIndex(preorder, right);

            ans.add(r - l + 1);
        }

        return ans;
    }

    private static int findLeftIndex(ArrayList<Integer> lis, int target) {
        int lo = 0, hi = lis.size() - 1;

        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int ele = lis.get(mid);

            if (ele == target) {

                while (mid > 0 && lis.get(mid - 1) == lis.get(mid))
                    mid -= 1;

                return mid;
            } else if (ele < target) {
                lo = mid + 1;
            } else {
                ans = mid;
                hi = mid - 1;
            }
        }

        return ans;
    }

    private static int findRightIndex(ArrayList<Integer> lis, int target) {

        int lo = 0, hi = lis.size() - 1;

        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            int ele = lis.get(mid);

            if (ele == target) {
                while (mid < lis.size() - 1 && lis.get(mid) == lis.get(mid + 1))
                    mid += 1;

                return mid;
            } else if (ele < target) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }
}
