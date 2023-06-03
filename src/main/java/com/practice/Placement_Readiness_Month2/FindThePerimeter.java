package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class FindThePerimeter {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble();
        sc.close();
        double r = Math.sqrt(area / Math.PI);
        System.out.println(2 * Math.PI * r);
    }
}
