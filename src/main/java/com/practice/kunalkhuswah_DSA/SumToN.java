package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SumToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
//		System.out.println(sumOfN(1 ,n, k, "", 0, 0));
		System.out.println(combinationSum3(k, n));
	}
	
	public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lis = new ArrayList<>();
        sumOfN(1 ,n, k, new ArrayList<Integer>(), 0, lis);
        return lis;
    }

    public static void sumOfN(int index, int n, int k, List<Integer> ans, int sum, List<List<Integer>> lis) {
		
    	if(sum == n && ans.size() == k) {
    		List<Integer> li = new ArrayList<Integer>(ans);
			lis.add(li);
			return;
		}
			
		if(ans.size() > k || sum > n) 
			return;
		
		
		for(int i = index; i <= 9; i++) {
			ans.add(i);
			sumOfN(i + 1, n, k, ans, sum + i, lis);
			ans.remove(ans.size() - 1);
		}
	}

//	private static int sumOfN(int index, int n, int k, String ans, int sum, int count) {
//		
//		if(sum == n && ans.length() == k) {
//			System.out.println(ans);
//			return count + 1;
//		}
//			
//		if(ans.length() > k || sum > n) 
//			return count;
//		
//		
//		for(int i = index; i <= 9; i++) {
//			count = sumOfN(i + 1, n, k, ans + i, sum + i, count);
//		}
//		
//		
//		return count;
//	}
}
