package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=1sKFr_fhcV4
 * https://leetcode.com/problems/number-of-visible-people-in-a-queue/
 */

import java.util.Scanner;
import java.util.Stack;

public class NumberOfVisiblePeopleInAQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0;i<n;++i){
            heights[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = canSeePersonsCount(n,heights);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] canSeePersonsCount(int n, int[] heights) {
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            int ele = heights[i];
            // checking current height greater than stack's current height
            // yes: take index and increase it's count + 1; and pop
            // No: increase only count
            while(!st.isEmpty() && heights[st.peek()] < ele) {
                int index = st.pop();
                ans[index] += 1;
            }

            if(!st.isEmpty() && heights[st.peek()] > ele)
                ans[st.peek()] += 1;
            st.push(i);
        }
        return ans;
    }
}
