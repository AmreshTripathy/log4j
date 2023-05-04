package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/max-points-on-a-line/
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxPointsOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        sc.close();

        System.out.println(maxPoints(points));
    }

    private static int maxPoints(int[][] points) {
        int max = 0;

        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                double slope;
                if (points[i][0] - points[j][0] == 0)
                    slope = Double.MAX_VALUE;
                else {
                    slope = (points[i][1] - points[j][1]) / (double) (points[i][0] - points[j][0]);
                    if (slope == -0.0)
                        slope = 0.0;
                }
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
        }

        return max + 1;
    }
}
