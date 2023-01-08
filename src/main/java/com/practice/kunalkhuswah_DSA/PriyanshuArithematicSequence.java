package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class PriyanshuArithematicSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        Accio obj = new Accio();
        String ans = checkIsAP(n,arr);
        System.out.println(ans);
        sc.close();
	}
	
	static String checkIsAP(int n,int[] arr){

		int dis = arr[1] - arr[0];
		int[] temp = arr.clone();
		Arrays.sort(arr);
		
		if(Arrays.equals(temp, arr))
			return "No";
		
		for(int i = 0; i < n-1; i++){
			if(arr[i] - arr[i+1] != dis){
				return "No";
			}
		}
		
		return "Yes";
    }
}
