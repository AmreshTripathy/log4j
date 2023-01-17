package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/flip-string-to-monotone-increasing/
 */

import java.util.Scanner;

public class FlipStringToMonotoneIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(minFlipsMonoIncr(str));
    }

    private static int minFlipsMonoIncr(String s) {
        int countZero = 0;
        int countOne = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1')
                countOne++;
            else if(s.charAt(i) == '0' && countOne > 0)
                countZero++;

            countZero = Math.min(countZero, countOne);
        }

        return countZero;
    }
}
