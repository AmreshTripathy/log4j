package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/
 */

import java.util.Scanner;
import java.util.Stack;

public class LengthOfTheLongestAlphabeticalContinuousSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(longestContinuousSubstring(s));
    }

    private static int longestContinuousSubstring(String s) {

        if (s.isEmpty())
            return 0;

        Stack<Character> st = new Stack<>();
        int length = 1;

        for (char ch : s.toCharArray()) {

            if (st.size() > 0 && (st.peek() > ch || (ch - st.peek() != 1))) {
                length = Math.max(length, st.size());
                st.clear();
            }

            st.push(ch);
        }

        length = Math.max(length, st.size());
        return length;
    }
}