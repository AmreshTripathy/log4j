package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=339b28b9-971f-4316-aede-7b9e0f20934f
 */

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbingStairs(n));
        sc.close();
    }

    public static int climbingStairs(int n) {
        // Write your code here
		if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }
}
