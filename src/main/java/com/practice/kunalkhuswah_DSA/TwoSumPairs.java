package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6e70f2ee-6873-4373-acb9-d179d6ce555e
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoSumPairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        List<List<Integer>> res = twoSum(arr, target);
        ArrayList<String> finalResult = new ArrayList<>();
        for (List<Integer> list : res) {
            Collections.sort(list);
            String ans = "";
            for (int val : list) {
                ans += val + " ";
            }
            finalResult.add(ans);
        }
        Collections.sort(finalResult);
        for (String str : finalResult) {
            System.out.println(str);
        }
    }

    public static List<List<Integer>> twoSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int sp = 0, ep = arr.length - 1;

        while (sp < ep) {
            int sum = arr[sp] + arr[ep];

            if (sum == target) {
                List<Integer> lis = new ArrayList<>();
                lis.add(arr[sp]);
                lis.add(arr[ep]);
                ans.add(lis);

                // removing duplicate from start
                while (sp + 1 < ep && arr[sp] == arr[sp + 1])
                    sp++;
                sp++;

                // removing duplicate from end
                while (ep - 1 > sp && arr[ep] == arr[ep - 1])
                    ep--;
                ep--;
            } else if (sum < target) {
                // removing duplicate from start
                while (sp + 1 < ep && arr[sp] == arr[sp + 1])
                    sp++;
                sp++;
            } else {
                // removing duplicate from end
                while (ep - 1 > sp && arr[ep] == arr[ep - 1])
                    ep--;
                ep--;
            }
        }

        return ans;
    }
}
