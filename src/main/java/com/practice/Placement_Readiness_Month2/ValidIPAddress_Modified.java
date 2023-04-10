package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=271c50f1-992a-48fd-b19b-344a3c97e3a3
 * https://leetcode.com/problems/restore-ip-addresses/description/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ValidIPAddress_Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        ArrayList<String> ans = ValidIP(s);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    private static ArrayList<String> ValidIP(String s) {
        ArrayList<String> ans = new ArrayList<>();
        helper(s, 0, 0, "", ans);
        return ans;
    }

    private static void helper(String s, int i, int dots, String temp, ArrayList<String> ans) {

        if (i == s.length()) {
            if (dots == 4) {
                ans.add(temp.substring(0, temp.length() - 1));
            }
            return;
        }

        // calling recurssion for substring length 1, 2, 3 and checking 0 and > 255 case

        helper(s, i + 1, dots + 1, temp + s.charAt(i) + '.', ans);

        if ((i + 2) <= s.length() && isValid(s.substring(i, i + 2))) {
            helper(s, i + 2, dots + 1, temp + s.substring(i, i + 2) + '.', ans);
        }

        if ((i + 3) <= s.length() && isValid(s.substring(i, i + 3))) {
            helper(s, i + 3, dots + 1, temp + s.substring(i, i + 3) + '.', ans);
        }

    }

    private static boolean isValid(String str) {

        if (str.charAt(0) == '0')
            return false;

        if (Integer.parseInt(str) > 255)
            return false;

        return true;
    }
}
