package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TwoSuminSortedArray {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
        int target=sc.nextInt();
        int []A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int []ans = twosum(A,n,target);
        System.out.println(ans[0]+" "+ans[1]);      
	}
	
	public static int[] twosum(int arr[], int n, int target){
		int[] index = new int[2];
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(map.containsKey(target - arr[i])) {
				index[0] = map.get(target-arr[i]);
				index[1] = i+1;
				return index;
			}
			map.put(arr[i], i+1);
		}
		
		return index;
	}
}
