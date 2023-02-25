package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=f80249b5-a64b-4e21-8a51-1cb63a89bf18
 * https://leetcode.com/problems/longest-repeating-character-replacement/description/
 */

import java.util.Scanner;

public class KReplacementLongestCharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();
        int ans = characterReplacement(n, k, s);
        System.out.println(ans);
    }

    private static int characterReplacement(int n, int k, String s) {

        int maxLength = 0;
        // creating a array to store character frequency
        int[] freq = new int[26];

        int sp = 0, ep = 0, maxFreq = 0;

        while (ep < n) {
            freq[s.charAt(ep) - 'a']++;
            int currCharCount = freq[s.charAt(ep) - 'a'];
            maxFreq = Math.max(maxFreq, currCharCount);

            // ep - sp - maxFreq + 1 > k -> after removing maxcount we found there are extra chracters
            // we need to remove so we need to increase the starting pointer
            while (ep - sp - maxFreq + 1 > k) {
                freq[s.charAt(sp++) - 'a']--;
            }

            maxLength = Math.max(maxLength, ep - sp + 1);
            ep++;
        }

        return maxLength;
    }
}
