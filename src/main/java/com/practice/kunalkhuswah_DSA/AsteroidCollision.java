package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=4d8f93dd-693d-43a3-b3d1-2fcbad36d2ff
 */

import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int[] result = asteroidCollision(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }

    private static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>();

        for(int val: asteroids) {
            if(val > 0)
                stk.push(val);
            else{
                while(stk.size() > 0 && stk.peek() > 0 && stk.peek() < -val) {
                    stk.pop();
                }
                
                if(stk.size() > 0 && stk.peek() == -val)
                    stk.pop();
                else if(stk.size() > 0 && stk.peek() > -val){

                }else
                    stk.push(val);
            }
        }
        
        int n = stk.size();
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i--)
            ans[i] = stk.pop();

        return ans;
    }
}
