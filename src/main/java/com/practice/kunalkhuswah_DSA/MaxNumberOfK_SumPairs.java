package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b159eb89-5c05-4e0a-a749-49c234e5ed98
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxNumberOfK_SumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k;
        k = sc.nextInt();
        int result = maxOperations(arr, k);
        System.out.println(result);
        sc.close();
    }

    private static int maxOperations(int[] nums, int k) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for(int i = 0 ; i < nums.length; i++) {
            int target = k - nums[i];

            if (map.containsKey(nums[i]) && map.containsKey(target)) {
                if (nums[i] != target) {
                    count += Math.min(map.get(nums[i]), map.get(target));
                    map.put(nums[i], 0);
                    map.put(target, 0);
                } else if (nums[i] == target) {
                    count += Math.floor(map.get(target) / 2);
                    map.put(target, 0);
                }
            }
        }

        return count;
    }
}
