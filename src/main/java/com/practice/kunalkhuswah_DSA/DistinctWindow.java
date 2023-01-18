package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9cc8f33f-8879-4406-8eee-193ccc59fbac
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctWindow {
    public static String distinctWindow(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray())
            set.add(ch);

        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int includeIndex = -1;
        int excludeIndex = -1;

        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            // include
            while (includeIndex < s.length() - 1 && map.size() < set.size()) {
                includeIndex++;
                char ch = s.charAt(includeIndex);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                f1 =  true;
            }

            // exclude
            while (excludeIndex < includeIndex && map.size() == set.size()) {
                String currAns = s.substring(excludeIndex + 1, includeIndex + 1);
                if (ans.length() == 0 || ans.length() > currAns.length())
                    ans = currAns;

                excludeIndex++;
                char ch = s.charAt(excludeIndex);
                map.put(ch, map.getOrDefault(ch, 0) - 1);

                if (map.get(ch) == 0)
                    map.remove(ch);

                f2 = true;
            }

            if(f1 == false && f2 == false)
                break;
        }

        return ans;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String ans = distinctWindow(s);
        System.out.println(ans);
    }
}
