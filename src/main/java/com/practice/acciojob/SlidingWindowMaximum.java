package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2da7ad22-cccc-497d-864c-a3ea784e1263
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = slidingWindowMaximum(n, k, nums);
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] slidingWindowMaximum(int n, int k, int[] arr) {
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        int sp = 0, ep = 0, i = 0;
        while (ep < k) {
            while (dq.size() > 0 && arr[dq.getLast()] < arr[ep])
                dq.removeLast();

            dq.add(ep);
            ep++;
        }

        ans[i++] = arr[dq.getFirst()];

        while (ep < n) {

            while (dq.size() > 0 && arr[dq.getLast()] < arr[ep])
                dq.removeLast();

            dq.add(ep);
            ep++;

            sp++;

            while (dq.size() > 0 && dq.getFirst() < sp)
                dq.removeFirst();

            ans[i++] = arr[dq.getFirst()];
        }

        return ans;
    }
}
