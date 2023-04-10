package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=271c50f1-992a-48fd-b19b-344a3c97e3a3
 * https://leetcode.com/problems/restore-ip-addresses/description/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ValidIPAddress {
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
        helper(s, 0, "", ans);
        return ans;
    }

    private static void helper(String s, int i, String temp, ArrayList<String> ans) {

        if (i >= s.length()) {
            // removing last '.' from temp string
            temp = temp.substring(0, temp.length() - 1);
            // checking if there is 4 groups so 4 - 1 = 3 dots, difference between
            // temp & s = 3, then there exist 4 groups
            if (temp.length() - s.length() != 3)
                return;

            if (ans.contains(temp))
                return;

            ans.add(temp);
            return;
        }

        // adding strings one by one
        ArrayList<String> lis = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int index = i; index < i + 3 && index < s.length(); index++) {
            sb.append(s.charAt(index));
            String newString = sb.toString();

            if (newString.equals("0")) {
                lis.add(newString);
                break;
            }

            if (Integer.parseInt(sb.toString()) > 255) {
                newString = sb.substring(0, 2) + '.' + sb.substring(2);
            }
            lis.add(newString);
        }

        // calling recurssion here
        int count = 0;

        for (String str : lis) {
            helper(s, i + count + 1, temp + str + '.', ans);
            count++;
        }
    }
}
