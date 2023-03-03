package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=918eba5b-8154-40f2-b7e9-20ffd27fba44
 */

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();
        int[] ans = singleNumber3(n, arr);
        System.out.print(ans[0] + " " + ans[1]);
    }

    public static int[] singleNumber3(int n, int[] nums) {
        int xarr = 0;

        for (int i = 0; i < n; i++)
            xarr ^= nums[i];

        int k = 0;
        while ((xarr & (1 << k)) == 0) // we are finding the right most set bit
            k++;

        int xorOfpeopleHavingKthBitSet = 0;
        int xorOfpeopleHavingKthBitUnSet = 0;

        for (int num : nums) {
            if ((num & (1 << k)) > 0)
                xorOfpeopleHavingKthBitSet ^= num;
            else
                xorOfpeopleHavingKthBitUnSet ^= num;
        }

        int[] ans = {xorOfpeopleHavingKthBitSet, xorOfpeopleHavingKthBitUnSet};
        Arrays.sort(ans);

        return ans;
    }
}
