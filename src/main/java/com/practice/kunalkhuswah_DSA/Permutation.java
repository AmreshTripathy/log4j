package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * @Amresh Tripathy
 */

public class Permutation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i < n;  i++)
        	arr[i]=sc.nextInt();
        
        sc.close();
        printPermutations(n , arr);
    }
	
	public static void printPermutations(int index, int[] arr) {
		List<Integer> lis = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++)
			lis.add(arr[i]);
		
		Set<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
		
		solve(0, lis, result);
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>(result);
		
		Collections.sort(ans, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> a, List<Integer> b) {
				int size = a.size();
				
				for(int i = 0; i < size; i++) {
					if(a.get(i) < b.get(i))
						return -1;
					if(a.get(i) > b.get(i))
						return 1;
				}
				return 0;
			}
		});
		
		for(List<Integer> a :ans) {
			for(int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i) + " ");
			}
			System.out.println();
		}
    }

	private static void solve(int index, List<Integer> lis, Set<ArrayList<Integer>> result) {
		
		if(index == lis.size()) {
			result.add(new ArrayList<Integer>(lis));
			return;
		}
		
		if(index > lis.size()) return;
		
		for(int i = index; i < lis.size(); i++) {
			Collections.swap(lis, i, index);
			solve(index + 1, lis, result);
			Collections.swap(lis, i, index);
		}
	}
}
