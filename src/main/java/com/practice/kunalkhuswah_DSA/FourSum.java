package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8857040e-21ae-471d-b2ee-8b01e18f681d
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();

        List<List<Integer>> res = fourSum(nums, k);

        for (int i = 0; i < res.size(); i++) {
            Collections.sort(res.get(i));
        }

        Collections.sort(res, new Comparator<List<Integer>>() {
            public int compare(List<Integer> frst, List<Integer> scnd) {
                int i = 0;
                while (frst.get(i) == scnd.get(i))
                    i++;
                return frst.get(i) - scnd.get(i);
            }
        });

        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        // taking first element and checking for newTarget = k - ith element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int newTarget = target - (nums[i] + nums[j]);

                twoSum(nums, nums[i], nums[j], j + 1, n - 1, newTarget, ans);
                // removing duplicacy
                while(j + 1 < n && nums[j] == nums[j + 1]) j++;
            }
            // removing duplicacy
            while(i + 1 < n && nums[i] == nums[i + 1]) i++;
        }

        return ans;
    }

    private static void twoSum(int[] nums, int first, int second, int i, int j, int newTarget, List<List<Integer>> ans) {

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == newTarget) {
                List<Integer> lis = new ArrayList<>();
                lis.add(first);
                lis.add(second);
                lis.add(nums[i]);
                lis.add(nums[j]);
                ans.add(lis);
                i++;
                // removing duplicacy
                while(i < j && nums[i] == nums[i - 1]) i++;
                j--;
                // removing duplicacy
                while(j > i && nums[j] == nums[j + 1]) j--;
            } else if (sum < newTarget) {
                i++;
                while(i < j && nums[i] == nums[i - 1]) i++;
            } else {
                j--;
                while(j > i && nums[j] == nums[j + 1]) j--;
            }
        }

    }
}
