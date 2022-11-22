package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CountPairsWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();
		sc.close();
		int ans = countPairs(arr, n, k);

		System.out.println(ans);
	}
	
	static int countPairs(int arr[], int n, int k)
    {
        int count = 0;
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                count += map.get(k-arr[i]);
            }
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
		return count;
    }
}