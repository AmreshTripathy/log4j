package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class OldPhoneKeypad {
	
	protected static ArrayList<String> enc = new ArrayList<String>(Arrays.asList("", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TU", "VWX", "YZ"));
    private static ArrayList<String> OldPhone(int n, int i,int[] keys, String ans, ArrayList<String> lis){
    	
    	if(i == n) {
    		lis.add(ans);
    		return lis;
    	}
    	
    	int index = keys[i];
    	
    	for(int j = 0; j < enc.get(index).length(); j++) {
    		lis = OldPhone(n, i + 1, keys, ans + enc.get(index).charAt(j), lis);
    	}
    	
    	return lis;
    }
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        sc.close();
        ArrayList <String> ans=OldPhone(n, 0,keys, "", new ArrayList<String>());
        for(String i:ans) System.out.print(i+" ");
	}
}
