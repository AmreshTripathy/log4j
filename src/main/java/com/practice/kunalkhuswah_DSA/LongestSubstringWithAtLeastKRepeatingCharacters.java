package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9be96ee1-cf8d-4bcc-936b-899f22782a7f
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        scn.close();
        System.out.println(longestSubstring(str, k));
    }

    private static int longestSubstring(String s, int k) {
        int n = s.length();

        // if n == 0 return 0
        // if k > n means k count is greater than string size so no chracters present above k so return 0
        if (n == 0 || k > n)
            return 0;

        // if (k == 1) all characters are valid
        if (k <= 1)
            return n;

        Map<Character, Integer> counts = new HashMap<>();
        for (char ch: s.toCharArray())
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);

        int left = 0;
        // increasing the loop upto we get any character which count is less than k
        while (left < n && counts.get(s.charAt(left)) >= k)
            left++;

        // if left index is grater than equal to n - 1 means all characters count are greater than equal to k
        // even if we found last character count < k, we return left (means indicates size of the string)
        if (left >= n - 1)
            return left;

        // checking for left substring
        int leftSubstring = longestSubstring(s.substring(0, left), k);

        // there is a scenario exist where characters those are continuous, so we have to increase the left index
        while (left < n && counts.get(s.charAt(left)) < k)
            left++;
        
        // checking for right substring
        // adding a constrain to check whether there is any string left on right or not
        int rightSubstring = (left < n) ? longestSubstring(s.substring(left), k) : 0;

        return Math.max(leftSubstring, rightSubstring);
    }
}
