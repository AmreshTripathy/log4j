package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=84eaa7c7-041a-4264-91a0-a3591d1b2637
 */

import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("[", "").replace("]", "");
        String[] arr_str = str.split(",");
        int[] arr = new int[arr_str.length];
        for (int i = 0; i < arr_str.length; i++) {
            arr[i] = Integer.parseInt(arr_str[i]);
        }

        sc.close();
        System.out.println(isFound(arr, arr.length));
    }

    private static boolean isFound(int[] arr, int n) {

        // Using sliding window approach
        if (n < 3)
            return false;

        int i = 0, j = 0, sum = 0;

        while (j < 3)
            sum += arr[j++];

        while (j < n) {
            if (sum == 7)
                return true;

            sum -= arr[i++];
            sum += arr[j++];
        }

        return (sum == 7) ? true : false;
    }
}
