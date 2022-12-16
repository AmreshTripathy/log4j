package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CoinsPermutations_1 {
	public static void coinChange(int[] coins, boolean[] done, int amt, int sum, String ans){
        if(sum > amt) return;
		
		if(sum == amt){
			System.out.println(ans);
			return;
		}

		for(int i = 0; i < coins.length; i++) {
			if(!done[i]){
				done[i] = true;
				coinChange(coins, done, amt, sum + coins[i], ans + coins[i] + " ");
				done[i] = false;
			}
		}
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        sc.close();
        coinChange(coins, new boolean[coins.length], amt, 0, "");
    }
}
