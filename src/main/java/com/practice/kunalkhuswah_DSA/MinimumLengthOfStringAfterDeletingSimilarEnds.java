package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3ce558cd-62b9-47c7-9c0f-fc5c88224880
 */

import java.util.Scanner;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
        sc.close();
    }

    private static int solve(String s) {
        int minLength = s.length();

        int sp = 0;
        int ep = s.length() - 1;

        while (sp < ep) {
            char sp_ch = s.charAt(sp);
            char ep_ch = s.charAt(ep);

            if (sp_ch == ep_ch) {
                while (sp + 1 < ep && sp_ch == s.charAt(sp + 1)) {
                    sp++;
                }

                sp++;

                while (ep + 1 > sp && ep_ch == s.charAt(ep - 1)) {
                    ep--;
                }

                ep--;

                minLength = Math.min(minLength, ep - sp + 1);
            } else {
                break;
            }
        }

        return (minLength == -1) ? 0 : minLength;
    }
}
