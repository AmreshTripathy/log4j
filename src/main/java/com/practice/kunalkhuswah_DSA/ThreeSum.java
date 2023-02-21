package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=4a19f884-ea9e-4fe9-b240-e43c935fb8b2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        input.close();
        List<List<Integer>> result = threeSum(nums);
        //Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }
        //Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) return -1;
                    else if (l1.get(i) > l2.get(i)) return 1;
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums);

        // taking first element and checking for newTarget = k - ith element
        for (int i = 0; i < n; i++) {
            int newTarget = -nums[i];

            twoSum(nums, nums[i], i + 1, n - 1, newTarget, ans);
        }

        return new ArrayList<>(ans);
    }

    private static void twoSum(int[] nums, int first, int i, int j, int newTarget, Set<List<Integer>> ans) {

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == newTarget) {
                List<Integer> lis = new ArrayList<>();
                lis.add(first);
                lis.add(nums[i]);
                lis.add(nums[j]);
                ans.add(lis);
                i++;
                j--;
            } else if (sum < newTarget) {
                i++;
            } else {
                j--;
            }
        }

    }
}
