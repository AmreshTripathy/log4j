package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AllPossiblePaths {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        sc.close();
        allpossiblepaths(0,a,n,"");
	}
	
	public static void allpossiblepaths(int i,int[] a,int n, String ans) {
        if(i == n - 1) {
        	ans += i;
        	System.out.println(ans);
        	return;
        }
        
        for(int jump = 1; jump <= a[i] && i + jump < n; jump++) {
        	allpossiblepaths(i + jump, a, n, ans + i + " -> ");
        }
    }
}
