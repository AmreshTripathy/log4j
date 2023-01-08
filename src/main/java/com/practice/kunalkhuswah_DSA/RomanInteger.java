package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RomanInteger {
	
	protected static Scanner sc =  new Scanner(System.in);
	
	public static int romanToInt(String s) {
        
		int sum = 0;
		Map<String, Integer> symVal = new HashMap<String, Integer>(); 
		symVal.put("I", 1);
		symVal.put("V", 5);
		symVal.put("X", 10);
		symVal.put("L", 50);
		symVal.put("C", 100);
		symVal.put("D", 500);
		symVal.put("M", 1000);
		
		String[] arr = s.split("");
		
		sum = valueCompareString(symVal, arr);
		
		return sum;
    }
	
	public static int valueCompareString(Map<String, Integer> symVal, String[] arr) {
		
		int a = 0;
		boolean minus = false;
		for(int i=0; i < arr.length;  i++) {
			if(((i+1) < arr.length) && (symVal.get(arr[i])  < symVal.get(arr[i+1]))) {
				a += (symVal.get(arr[i+1]) - symVal.get(arr[i]));
				minus = true;
			}else if(!minus) {
				a += symVal.get(arr[i]);
			}else {
				minus =  false;
			}
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();

        int[] arr = new int[t];
        
        for(int i = 0; i < t; i++){
        	arr[i] = romanToInt(sc.next());
        }
        
        for(int i = 0; i < t; i++) {
        	System.out.print(arr[i] + " ");
        }
	}
}
