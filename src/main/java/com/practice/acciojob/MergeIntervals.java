package com.practice.acciojob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
        merge(A);
    }

    private static void merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> lis = new ArrayList<>();

        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= right) {
                left = Math.min(left, intervals[i][0]);
                right = Math.max(right, intervals[i][1]);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(left);
                temp.add(right);
                lis.add(temp);
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(left);
        temp.add(right);
        lis.add(temp);

        for (List<Integer> tem: lis)
            System.out.println(tem.get(0) + " " + tem.get(1));
    }
}
