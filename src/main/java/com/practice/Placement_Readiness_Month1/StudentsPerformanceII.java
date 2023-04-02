package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;
import java.util.Stack;

public class StudentsPerformanceII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        sc.close();
        int[] result = solve(arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println('\n');
    }

    public static int[] solve(int[] arr) {
        // Your code here
        int[] ans = new int[arr.length];

        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (stk.size() > 0 && arr[stk.peek()] <= arr[i])
                stk.pop();

            if (stk.isEmpty())
                ans[i] = -1;
            else
                ans[i] = i - stk.peek();

            stk.add(i);
        }

        return ans;
    }
}
