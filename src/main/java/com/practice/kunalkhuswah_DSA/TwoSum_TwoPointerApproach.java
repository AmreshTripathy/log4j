package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * 
 * This Approch only applicable to sorted matrix
 * 
 * https://course.acciojob.com/idle?question=05d6b1b0-d843-4974-8a19-c65be520d5a9
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoSum_TwoPointerApproach {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");

        int[] arr = new int[(int) n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        br.close();

        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        int[] ans = new int[2];

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                return ans;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }

        }

        return ans;
    }
}
