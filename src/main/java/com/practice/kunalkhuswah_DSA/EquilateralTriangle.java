package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class EquilateralTriangle {
	protected static Scanner sc = new Scanner(System.in);
	
	public static int[] equiTriangle(int[] arr, int[] temp, int x_count, int pos) {
		int count = 0;
		int match_count = 0;
		
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			count++;
			int plusOne = arr[i] + 1;
			for(int j = 0; j < size; j++) {
				if(i!=j && plusOne > 0 && plusOne == arr[j]) {
					match_count++;
				}
			}
			
			if(match_count == 2) {
				temp[0] = match_count;
				temp[1] = count + x_count;
				return temp;
			}else {
				match_count = 0;
			}
			int minusOne = arr[i] - 1;
			for(int j = 0; j < size; j++) {
				if(i!=j && minusOne > 0 && minusOne == arr[j]) {
					match_count++;
				}
			}
			
			if(match_count == 2) {
				temp[0] = match_count;
				temp[1] = count + x_count;
				return temp;
			}else {
				count = 0;
				match_count = 0;
				temp[0] = match_count;
				temp[1] = count + x_count;
			}
		}
		
		return temp;
	}
	
	public static int[] findForOtherPositions(int[] arr, int[] temp, int x_count, int pos) {
		int size = arr.length;
		int[] plus_arr = new int[size];
		int[] minus_arr = new int[size];
		
		for(int i=0;i<size;i++){
			plus_arr[i]=arr[i];
			minus_arr[i]=arr[i];
        }
		
		for(pos = 0; pos < size; pos++) {
			plus_arr[pos] = arr[pos] + 1;
			if(plus_arr[pos] > 0) {
				temp = equiTriangle(plus_arr,temp,x_count,pos+1);
				if(temp[0] == 2) {
					return temp;
				}
			}
			minus_arr[pos] = arr[pos] - 1;
			if(minus_arr[pos] > 0) {
				temp = equiTriangle(minus_arr,temp,x_count,pos+1);
				if(temp[0] == 2) {
					return temp;
				}
			}
			x_count++;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		final int[] arr = new int[n];
		int[] temp = new int[2];
		int x_count = 0;
		int pos = 0;
		for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
		temp = equiTriangle(arr,temp, x_count, pos);
		if(temp[0] == 2 && temp[1] < 3) {
			System.out.println(temp[1]);
		}
		else {
			x_count++;
			temp = findForOtherPositions(arr,temp, x_count, pos);
			if(temp[0] == 2 && temp[1] < 3) {
				System.out.println(temp[1]);
			}else if(n == 3){
				System.out.println(2);
			}else {
				System.out.println(0);
			}
		}
	}
}
