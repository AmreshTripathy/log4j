package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=617c656f-342f-4dd1-b9e0-5c1469fad4a7
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayWithEqualFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(longestSubarray(arr));
    }

    private static int longestSubarray(int[] arr) {
        int maxLength = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("0#0", -1);

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) countZero++;
            if(arr[i] == 1) countOne++;
            if(arr[i] == 2) countTwo++;

            int deltaOneZero = countOne - countZero;
            int deltaTwoOne = countTwo - countOne;

            String code = String.valueOf(deltaOneZero) + "#" + String.valueOf(deltaTwoOne);
            if(map.containsKey(code))
                maxLength = Math.max(maxLength, (i - map.get(code)));
            else
                map.put(code, i);
        }

        return maxLength;
    }
}
