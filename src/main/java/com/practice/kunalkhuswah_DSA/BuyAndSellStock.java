package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=df87917b-67af-48b0-a132-0832e02a38f8
 */

import java.util.Scanner;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        input.close();
        int ans = bestTimeToBuyAndSell(n,a);
        System.out.println(ans);
    }

    private static int bestTimeToBuyAndSell(int n, int[] prices) {
        int ans = 0;

        // building right max of every array element
        int[] rightMax = new int[n];

        rightMax[n - 1] = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], prices[i]);
        }

        for (int i = 0; i < n; i++) {
            int diff = rightMax[i] - prices[i];
            ans = Math.max(ans, diff);
        }
        
        return ans;
    }
}
