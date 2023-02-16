package com.practice.acciojob;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();
        sc.close();

        System.out.println(subarraysDivByK(arr, k));
    }

    private static int subarraysDivByK(int[] arr, int k) {

        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0)
                rem += k;
            if (map.containsKey(rem))
                count += map.get(rem);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
