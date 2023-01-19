package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=YWXbu5uyGXs
 * https://course.acciojob.com/idle?question=1ca1c62e-19c2-4ef6-9f62-0fb652b756dc
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubsequenceWithDifferenceOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();
        sc.close();
        System.out.println(longestSubsequence(nums));
    }

    public static int longestSubsequence(int[] nums) {
        int maxLength = 0; // returning maximum length of sub sequence

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // here we are checking one by one for +1 and -1 element and storing max of both the counts;
        for(int num: nums) {
            int n1 = map.getOrDefault(num - 1, 0) + 1;
            int n2 = map.getOrDefault(num + 1, 0) + 1;

            int n = Math.max(n1, n2);
            map.put(num, n);
            
            maxLength = Math.max(maxLength, n);
        }

        return maxLength;
    }
}