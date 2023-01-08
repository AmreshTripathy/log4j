package com.practice.kunalkhuswah_DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * @Amresh Tripathy
 */

public class ASSortingProblem5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int[] arr = new int[n];
        
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        
        int ans= sorting5(n, arr);
        System.out.println(ans);
	}

	private static int sorting5(int n, int[] arr) {
		List<Integer> lis = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				lis.add(arr[i] * arr[j]);
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < lis.size(); i++) {
			for(int j = i+1; j < lis.size(); j++) {
				if(max < (int) Math.abs(lis.get(i) - lis.get(j))) {
					max = (int) Math.abs(lis.get(i) - lis.get(j));
				}
			}
		}
		
		return max;
	}
}
