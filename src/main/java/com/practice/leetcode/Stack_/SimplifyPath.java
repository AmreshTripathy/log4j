package com.practice.leetcode.Stack_;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/simplify-path/
 */

import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        sc.close();

        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        // adding sub-strings in to stack
        // if that is '.' we do nothing
        // if find '..' we pop previous string
        // else we add the string
        // then create a new String to add join all strings using '/'
        // if new string is empty we need to print only '/'

        Stack<String> stk = new Stack<>();
        char[] arr = path.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '/')
                continue;

            String temp = "";
            while (i < n && arr[i] != '/') {
                temp += arr[i];
                i++;
            }

            if (temp.equals(".") || temp.equals("")) {
                continue;
            } else if (temp.equals("..")) {
                if (stk.size() > 0)
                    stk.pop();
            } else {
                stk.add(temp);
            }

        }

        String ans = "";

        while (stk.size() > 0) {
            ans = "/" + stk.pop() + ans;
        }

        return (ans.isEmpty()) ? "/" : ans;
    }
}
