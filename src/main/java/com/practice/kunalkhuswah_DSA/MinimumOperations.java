package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * @Amresh Tripathy
 */

public class MinimumOperations {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();
            
            minOperations(arr);
            t--;
        }
        sc.close();
	}
	
	public static void minOperations(int[] arr) {
        int n = arr.length;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++)
			if (hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i]) + 1);
			else
				hash.put(arr[i], 1);
		int max_count = 0;
		Set<Integer> s = hash.keySet();

		for (int i : s)
			if (max_count < hash.get(i))
				max_count = hash.get(i);
		
		System.out.println(n - max_count);
    }
}
