package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3e2e87d2-789f-4f85-9891-bfa3f2257aec
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDistinctElementsInSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        countDistinct(arr, k);
    }

    private static void countDistinct(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = arr.length;
        for (int i = 0; i < k; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        System.out.print(map.size() + " ");

        for(int i = k; i < n; i++) {
            // remove first element and add next element
            
            // 1. remove first element
            if(map.get(arr[i - k]) == 1)
                map.remove(arr[i - k]);
            else
                map.put(arr[i - k], map.get(arr[i - k]) - 1);

            // 2. remove second element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            System.out.print(map.size() + " ");
        }
    }
}
