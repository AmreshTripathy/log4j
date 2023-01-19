package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=Auk0E3E8G7c
 * https://course.acciojob.com/idle?question=a1fc462b-409b-4a19-aa5f-1f96ae32b972
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctCharacterSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        long ans = distinctCharacterSubstring(s);
        System.out.println(ans);
    }

    private static long distinctCharacterSubstring(String s) {
        long ans = 0; // here we are using two pointer approach one is for include and another point
                      // is to exclude
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int i = -1;
        int j = -1;
        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            while (i < s.length() - 1) {
                f1 = true;
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) == 2)
                    break;
                else
                    ans += i - j;
            }

            while (j < i) {
                f2 = true;
                j++;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch) - 1);

                if(map.get(ch) == 1) {
                    ans += i - j;
                    break;
                }
            }

            if (f1 == false && f2 == false)
                break;
        }

        return ans;
    }
}
