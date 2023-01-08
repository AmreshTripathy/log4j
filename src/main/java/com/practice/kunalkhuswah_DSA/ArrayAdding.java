package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ArrayAdding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int[] arr1 = new int[n1];
	    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

	    int n2 = sc.nextInt();
	    int[] arr2 = new int[n2];
	    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
	    sc.close();

	    int[] res = calSum(arr1, arr2, n1, n2);
	    for (int i : res) System.out.println(i);
	}
	
	private static int[] calSum(int a[], int b[], int n, int m) {
//	    int max = Math.max(a.length, b.length);
//	    int[] arr = new int[max];
//	    
//	    for(int i = 0; i < max; i++) {
//	    	int a_pos = a.length-1-i;
//	    	int b_pos = b.length-1-i;
//	    	
//	    	if(a_pos < 0) {
//	    		arr[max-1-i] = b[b_pos];
//	    	}else if(b_pos < 0) {
//	    		arr[max-1-i] = a[a_pos];
//	    	}else {
//	    		arr[max-1-i] = a[a_pos] + b[b_pos];
//	    	}
//	    }
		
		
		long a_num = Long.parseLong((Arrays.toString(a)).replaceAll(",", "").replaceAll(" ", "").replace("[", "").replace("]", ""));
		long b_num = Long.parseLong((Arrays.toString(b)).replaceAll(",", "").replaceAll(" ", "").replace("[", "").replace("]", ""));
		
		long sum = a_num + b_num;
		
		String s = String.valueOf(sum);
		
		int[] arr = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++)
			arr[i] = s.charAt(i) - '0';
	    
	    return arr;
	 }
}
