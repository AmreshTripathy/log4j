package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9f26fef4-1da2-4dc3-ba18-8a5de134239a
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
 * https://www.youtube.com/watch?v=HqetoBeBq_I
 */

import java.util.Scanner;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(numberOfSubstrings(s));
        sc.close();
    }

    private static int numberOfSubstrings(String s) {

        // using sliding window
        int sp = 0, ep = 0, n = s.length();
        // creating an array to store a, b, c's count
        int[] count = {0, 0, 0};
        int totalCount = 0;

        while (ep < n) {
            count[s.charAt(ep) - 'a']++;

            while (ep < n && count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // adding total substring left from ep to n
                // because if we got one string then another substring's on right are also valid incuding self
                totalCount += n - ep;

                // decreasing the count to check window wise
                count[s.charAt(sp++) - 'a']--;
            }
            ep++;
        }

        return totalCount;
    }
}
