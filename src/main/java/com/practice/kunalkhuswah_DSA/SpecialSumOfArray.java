package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SpecialSumOfArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = specialSum(arr,n);
        System.out.println(ans);
	}
	
	static int specialSum(ArrayList<Integer> arr, int n){
		int sum = arr.stream().mapToInt(Integer ::  intValue).sum();
		int num = 0;
		if(String.valueOf(sum).length() > 1) {
			sum = sumOfDigits(num, sum);
		}
		return sum;
	}

	private static int sumOfDigits(int num, int sum) {
		num = sum;
		sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		if(String.valueOf(sum).length() > 1) {
			sum = sumOfDigits(num, sum);
		}
		
		return sum;
	}
}
