package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c90a618d-eec4-4a30-8d6a-2db091389d50
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        int k = sc.nextInt();
        sc.close();

        System.out.println(countPairs(arr, n, k));
    }

    private static int countPairs(int[] arr, int n, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            
            if (map.containsKey(k - arr[i]))
                count += map.get(k - arr[i]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}
