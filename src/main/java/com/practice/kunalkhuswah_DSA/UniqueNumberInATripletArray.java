package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=22d4d855-f293-4437-91ec-83f03735ef79
 */

import java.util.Scanner;

public class UniqueNumberInATripletArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));
        sc.close();
    }

    public static int singleNumber(int[] nums) {
        // Your code here
        int[] freq = new int[32]; // this stores the total frequency of i'th bit

        for (int n : nums) {
            int i = 0;

            while (i < 32) {
                if((n & 1) == 1)
                    freq[i]++;
                i++;
                n >>= 1;
            }
        }

        // binary to decimal representation
        int ans = 0;
        int base = 1;

        for (int i = 0; i < 32; i++) {
            if (freq[i] % 3 == 1)
                ans += base;

            base *= 2;
        }

        return ans;
    }
}
