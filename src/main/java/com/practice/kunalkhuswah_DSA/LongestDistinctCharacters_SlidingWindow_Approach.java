package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=1a8e04d7-f665-46e5-ab81-59cdb1ceda32
 */

import java.util.Scanner;

public class LongestDistinctCharacters_SlidingWindow_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int len = longestUniqueSubsttr(str);
        System.out.println(len);
    }

    private static int longestUniqueSubsttr(String str) {
        // calculating the frequency

        int[] freq = new int[130];

        int sp = 0;
        int ep = 0;

        int max = 0;

        while (ep < str.length()) {
            char ch = str.charAt(ep);

            freq[ch]++;

            // if we got freq > 1, we increase the starting point (sp) upto the character's frequency 1 with decreasing the freqiency from start
            // because we need contgious unique character string

            /*
             * ex: geeksforgeeks
             * 
             * at ep = 3 -> freq of ep character is 2 
             * representing frequency upto ep ->  0->(g,1) 1->(e,1) 2->(e,2)
             * So we move sp up to ep with decrementing frequqncy
             * so sp will be 2
             * and freq will be 0->(g,0) 1->(e,0) 2->(e,1)
             * 
             * then calculate max length max, (ep - sp + 1)
             */
            while (freq[ch] > 1) {
                freq[str.charAt(sp++)]--;
            }

            // if (ep - sp + 1 > max)
            //     System.out.println(str.substring(sp, ep + 1));
            
            max = Math.max(max, ep - sp + 1);
            ep++;
        }

        return max;
    }
}
