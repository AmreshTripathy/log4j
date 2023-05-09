package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/remove-k-digits/
 * https://course.acciojob.com/idle?question=1996182c-ea44-4813-bb08-4cad964dac7d
 */

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        sc.close();
        String result = removeKdigits(num, k);
        System.out.println(result);
    }

    private static String removeKdigits(String num, int k) {
        // Stck is using because we need to compare the numbers
        // to delete

        Stack<Character> st = new Stack<>();
        int n = num.length();

        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);

            // checking if n1 > n2 & k
            while (st.size() > 0 && st.peek() > ch && k > 0) {
                st.pop();
                k--;
            }

            st.add(ch);
        }

        while (k > 0 && st.size() > 0) {
            st.pop();
            k--;
        }

        // adding character in a character array
        int m = st.size();
        char[] arr = new char[m];
        for (int i = m - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        // checking if there is any starting 0 present
        int i = 0;
        while (i < m && arr[i] == '0') {
            i++;
        }

        StringBuilder sb = new StringBuilder();
        while (i < m)
            sb.append(arr[i++]);

        return sb.isEmpty() ? "0" : sb.toString();
    }
}
