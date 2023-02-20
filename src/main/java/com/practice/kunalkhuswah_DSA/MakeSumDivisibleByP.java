package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=7aa67433-0a18-481d-98d9-602d65779b1a
 * https://leetcode.com/problems/make-sum-divisible-by-p/solutions/2282512/java-prefix-sum-and-hashmap-with-comments-and-example/?orderBy=most_votes
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeSumDivisibleByP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minSubarray(a, n, q));
    }

    public static int minSubarray(int[] A,int n, int p) {
        //Write code here

        // calculating sum for finding sum and checking if there extra sum present
        // if present we need to remove that element

        long sum = 0;
        for (int i = 0; i < n; i++)
            sum = (sum + A[i]) % p;

        int removeElement = (((int) sum % p) + p) % p;
        if (removeElement == 0)
            return 0;

        // returning minimum length subArray we need to remove
        int len = n;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // adding if we got the first index is the extra element we need to remove then len must need to be 1.
        // 0 - (-1) = 1

        long curSum = 0;
        for (int i = 0; i < n; i++) {
            
            curSum = (curSum + A[i]) % p;
            int rem = (((int) curSum % p) + p) % p;

            int reminderToSearch = (((rem - removeElement) % p) + p) % p;
            if (map.containsKey(reminderToSearch))
                len = Math.min(len, i - map.get(reminderToSearch));

            map.put(rem, i);
        }

        return (len == n) ? -1 : len;
    }
}
