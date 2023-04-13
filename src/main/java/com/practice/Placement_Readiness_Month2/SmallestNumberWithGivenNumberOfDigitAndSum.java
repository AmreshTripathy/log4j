package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9af07aa6-8553-4c43-bd37-83bff306832a
 * https://practice.geeksforgeeks.org/problems/smallest-number5829/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
 */

import java.util.Scanner;

public class SmallestNumberWithGivenNumberOfDigitAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        System.out.println(smallestNumber(n, d));
    }

    private static String smallestNumber(int n, int d) {

        StringBuilder sb = new StringBuilder();

        // adding 9 if it is greater than 9
        while (n > 9) {
            sb.append(9);
            n -= 9;
        }

        // adding the last element left
        sb.append(n);

        if (sb.length() > d) {
            return "-1";
        }

        // divide it into two elements by deceasing i.e 3 -> 3 - 1 = 2, (1, 2)
        int first = 1;
        int last = n - 1;

        // if StringBuilder size less than required digit length we remove the last
        // character so that we can add first and last integer
        if (sb.length() < d) {
            sb.deleteCharAt(sb.length() - 1);
            // appending last element
            sb.append(last);

            // checking if stringBuilder length is less than d - 1 or not
            // d - 1 because we need to add first element also so we need to make string
            // builder length as such that it have one space left to equal d
            while (sb.length() < (d - 1)) {
                sb.append(0);
            }

            sb.append(first);
        }

        sb.reverse();

        return sb.toString();
    }
}
