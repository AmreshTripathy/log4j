package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CombinationSum3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        List<List<Integer>> ans = combinationSum3(k,n, 0, 1, new ArrayList<Integer>(), new ArrayList<>());
        for(int i = 0 ; i < ans.size() ; ++i){
            Collections.sort(ans.get(i));
        }
        
        Collections.sort(ans, (o1, o2) -> {
            int m = Math.min(o1.size(), o2.size());
            for (int i = 0; i < m; i++) {
                if (o1.get(i) == o2.get(i)){
                    continue;
                }else{
                    return o1.get(i) - o2.get(i);
                }
            }
            return 1;
        });
    for (int i = 0; i < ans.size (); i++)
        {
            for (int j = 0; j < ans.get(i).size (); j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();

        }
	}
	
	public static List<List<Integer>> combinationSum3(int k, int n, int sum, int index, List<Integer> ans, List<List<Integer>> lis) {
        
		if(sum == n && ans.size() == k) {
			List<Integer> ls = new ArrayList<Integer>(ans);
			lis.add(ls);
			return lis;
		}
		
		if(sum > n || ans.size() > k) return lis;
		
		for(int i = index; i <= 9; i++) {
			ans.add(i);
			lis = combinationSum3(k, n, sum + i, i + 1, ans, lis);
			ans.remove(ans.size() - 1);
		}
		
		return lis;
    }
}
