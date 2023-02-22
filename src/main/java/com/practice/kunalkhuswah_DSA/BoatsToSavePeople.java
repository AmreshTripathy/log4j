package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2043dd77-9c0e-40e0-ba3e-71241af644cc
 */

import java.util.Arrays;
import java.util.Scanner;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(numRescueBoats(nums, k));
    }

    public static int numRescueBoats(int[] people, int limit) {

        // Using two pointer approach

        // First we check for first and last element
        // if sum > limit -> we decrease right pointer to sum to be minimized with count++;
        Arrays.sort(people);
        int count = 0;
        
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            int sum = people[i] + people[j];

            if (sum <= limit) {
                count++;
                i++;
                j--;
            } else {
                count++;
                j--;
            }
        }

        return count;
    }
}
