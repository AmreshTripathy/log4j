package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CeilingDivision {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double t = sc.nextDouble();
        sc.close();
        double total = (a + b) / t;
        total *= 100;
        System.out.println((int) total + "%");
    }
}
