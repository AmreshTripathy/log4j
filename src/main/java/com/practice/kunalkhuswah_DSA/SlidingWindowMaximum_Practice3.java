package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2da7ad22-cccc-497d-864c-a3ea784e1263
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum_Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = SlidingWindowMaximum(n, k, nums);
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] SlidingWindowMaximum(int n, int k, int[] arr) {
        int[] ans = new int[n - k + 1];

        int sp = 0;
        int ep = 0;

        // below is the index of ans array
        int i = 0;

        Deque<Integer> dq = new LinkedList<>();
        // Here we are using deque
        // adding first k elements from array to deque
        while (ep < k) {
            // while we get last dq element is lesser we pop it from end
            while (dq.size() > 0 && arr[dq.getLast()] < arr[ep])
                dq.removeLast();
            dq.add(ep);
            ep++;
        }

        ans[i++] = arr[dq.getFirst()];
        
        while (ep < n) {
            // incrementing ep and then checking whether it is greater or not

            while (dq.size() > 0 && arr[dq.getLast()] < arr[ep])
                dq.removeLast();

            dq.add(ep);
            ep++;

            // then checking the first element of queue is within window range or not
            sp++;

            while (dq.size() > 0 && dq.getFirst() < sp)
                dq.removeFirst();

            ans[i++] = arr[dq.getFirst()];
        }

        return ans;
    }
}