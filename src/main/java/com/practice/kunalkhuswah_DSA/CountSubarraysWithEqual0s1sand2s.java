package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=fPR4C822JOM
 * https://course.acciojob.com/idle?question=adb9b9f3-7409-4c5a-a694-3c43c5653fb4
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarraysWithEqual0s1sand2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] =  sc.nextInt();
        sc.close();

        System.out.println(countEqualSubarray012(arr, n));
    }

    private static int countEqualSubarray012(int[] arr, int n) {
        int count = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("0#0", 1);

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) countZero++;
            if(arr[i] == 1) countOne++;
            if(arr[i] == 2) countTwo++;

            int deltaOneZero = countOne - countZero;
            int deltaTwoOne = countTwo - countOne;

            String code = String.valueOf(deltaOneZero) + "#" + String.valueOf(deltaTwoOne);
            count += map.getOrDefault(code, 0);
            map.put(code, map.getOrDefault(code, 0) + 1);
         }

        return count;
    }
}
