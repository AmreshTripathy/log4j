package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=71f9e64f-56ec-499b-95d0-da312adf139c
 * https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
 */

import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(rangeCheck(intervals, a, b));
    }

    public static boolean rangeCheck(int[][] intervals, int a, int b) {
        // Write your code here

        // building one boolean prefix where for every boolean we are changing false -> true
        boolean[] pref = new boolean[51];
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            for(int j = left; j <= right; j++)
                pref[j] = true;
        }

        for (int i = a; i <= b; i++)
            if(pref[i] == false)
                return false;

        return true;
    }
}
