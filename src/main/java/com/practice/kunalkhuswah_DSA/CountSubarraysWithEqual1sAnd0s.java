package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=72efea8a-6472-4705-af3d-69ada985c057
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] =  sc.nextInt();
        sc.close();

        System.out.println(countEqualSubarray01(arr, n));
    }

    private static int countEqualSubarray01(int[] arr, int n) {
        int count = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("0", 1);

        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) countZero++;
            if(arr[i] == 1) countOne++;

            int deltaOneZero = countOne - countZero;

            String code = String.valueOf(deltaOneZero);
            count += map.getOrDefault(code, 0);
            map.put(code, map.getOrDefault(code, 0) + 1);
         }

        return count;
    }
}
