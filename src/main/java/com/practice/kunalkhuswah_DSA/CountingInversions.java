package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CountingInversions {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(sort(arr));
	}

	private static int sort(int[] arr) {
		int n = arr.length;
		int count = 0;
        for(int i = 1; i < n; i++) {
//            boolean changedPosition = false;
			/* storing current element before swapping by checking is there any
			 * greater element before that postioned element.
			*/
			int key =  arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				count++;
				arr[j+1] = arr[j]; // shiftting the element to their next postion
				j = j - 1;
			}
			
			arr[j + 1] = key;
			printArray(arr);
//            if(changedPosition){
//            	printArray(arr);
//                count++;
//            }
		}
        
        return count;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
