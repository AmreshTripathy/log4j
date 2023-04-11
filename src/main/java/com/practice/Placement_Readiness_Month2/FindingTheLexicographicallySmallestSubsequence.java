package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=718f4bb3-0762-4a4e-a6db-2dfff2c4380d
 * https://www.geeksforgeeks.org/lexicographically-smallest-k-length-subsequence-from-a-given-string/
 */

import java.util.Scanner;
import java.util.Stack;

public class FindingTheLexicographicallySmallestSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int k = scan.nextInt();
        scan.close();
        smallestSubsequence(S, k);
    }

    private static void smallestSubsequence(String s, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            while (st.size() > 0 && st.peek() > s.charAt(i) && /*
                                                                * // Check if there are enough
                                                                * // characters remaining
                                                                * // to obtain length K
                                                                */ (s.length() - i - 1 + st.size()) >= k)
                st.pop();

            st.add(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while (st.size() > 0) {
            sb.append(st.pop());
        }

        sb.reverse();
        System.out.println(sb);
    }
}
