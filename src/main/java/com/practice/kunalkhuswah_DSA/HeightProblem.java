package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=d66b627a-f0fe-4c9a-aefb-3582a213de33
 */

import java.util.Scanner;
import java.util.Stack;

public class HeightProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = heightProblem(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] heightProblem(int n, int[] arr) {
        int[] ans = new int[n];

        Stack<Integer> stk = new Stack<>();
        ans[0] = -1; // always the first element will be -1 because there is no previous element

        for(int i = 0; i < n; i++) {
            // pop every element upto you find the small element
            while(stk.size() > 0 && stk.peek() >= arr[i])
                stk.pop();
            
            ans[i] = (stk.isEmpty()) ? -1 : stk.peek();
            stk.push(arr[i]);
        }

        return ans;
    }
}
