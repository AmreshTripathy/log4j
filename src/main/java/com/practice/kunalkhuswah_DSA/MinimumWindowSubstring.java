package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8c817174-62b5-46e8-8cf7-00cc0d0ffa47
 */

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {
    private static String minWindow(String s, String t) {
        // counting the frequency of t string characters
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : t.toCharArray())
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        String ans = "";
        int desiredMatchCount = t.length(); // matchCount of anser must be of length t.length
        int matchCount = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int includeIndex = -1;
        int excludeIndex = -1;
        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            // include
            while (includeIndex < s.length() - 1 && matchCount < desiredMatchCount) {
                includeIndex++;
                char ch = s.charAt(includeIndex);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) <= freq.getOrDefault(ch, 0)) {
                    matchCount++;
                }
                f1 =  true;
            }

            // exclude
            while (excludeIndex < includeIndex && matchCount == desiredMatchCount) {
                String currAns = s.substring(excludeIndex + 1, includeIndex + 1);
                if (ans.length() == 0 || ans.length() > currAns.length())
                    ans = currAns;

                excludeIndex++;
                char ch = s.charAt(excludeIndex);
                map.put(ch, map.getOrDefault(ch, 0) - 1);

                if (freq.containsKey(ch) && freq.get(ch) > map.get(ch)) {
                    matchCount--;
                }

                if (map.get(ch) == 0)
                    map.remove(ch);

                f2 = true;
            }

            if(f1 == false && f2 == false)
                break;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, t;
        s = sc.next();
        t = sc.next();
        sc.close();
        System.out.println(minWindow(s, t));
        System.out.println(minWindow_slidingWindow(s, t));
    }

    private static String minWindow_slidingWindow(String s, String t) {
        int sp = 0;
        int ep = 0;

        int[] currentWindowFrequency = new int[130];
        int[] tFrequency = new int[130];

        // this is the original start and end point
        int osp = -1;
        int oep = -1;
        int ansSize = Integer.MAX_VALUE;

        // calaculating the frequency of t string
        for (int i = 0; i < t.length(); i++)
            tFrequency[t.charAt(i)]++;

        // sliding window
        while (ep < s.length()) {
            // we visit end point here and increase the frequency
            currentWindowFrequency[s.charAt(ep)]++;

            while (allCharactersPresent(tFrequency, currentWindowFrequency)) {
                if (ep - sp + 1 < ansSize) {
                    ansSize = ep - sp + 1;
                    osp = sp;
                    oep = ep;
                }

                currentWindowFrequency[s.charAt(sp)]--;
                sp++;
            }

            ep++;
        }

        return (osp == -1) ? "" : s.substring(osp, oep + 1);
    }

    private static boolean allCharactersPresent(int[] tFrequency, int[] currentWindowFrequency) {

        for (int i = 0; i < tFrequency.length; i++) {
            if(tFrequency[i] > currentWindowFrequency[i])
                return false;
        }

        return true;
    }
}
