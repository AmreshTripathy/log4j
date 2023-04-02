package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://leetcode.com/submissions/detail/926094469/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KthRowOfPascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        solve(k);
    }

    private static void solve(int k) {
        if (k == 0) {
            System.out.println(1);
            return;
        }

        if (k == 1) {
            System.out.println("1 1");
            return;
        }

        List<Integer> lis = new ArrayList<>(Arrays.asList(1, 1));

        while (lis.get(1) != k) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 1; i < lis.size(); i++) {
                temp.add(lis.get(i - 1) + lis.get(i));
            }

            temp.add(0, 1);
            temp.add(temp.size(), 1);
            lis = temp;
        }


        for (int ele : lis)
            System.out.print(ele + " ");

        System.out.println();

        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        
        for (int i = 1; i <= k; i++) 
            for (int j = i; j > 0; j--) 
                arr[j] = arr[j] + arr[j - 1];
        
         for (int ele : arr)
            System.out.print(ele + " ");
    }
}
