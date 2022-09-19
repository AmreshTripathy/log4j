package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ArrayReplacement {
	
	protected static Scanner sc =  new Scanner(System.in);
	
	public static String getDuplicateElement(int arr[]) {
		
		System.out.println("Enter the array elements");
		
		int[] modified_arr = new int[arr.length + 1];
		
		try {
			for(int i = 0;  i < arr.length; i++) {
				int num = sc.nextInt();
				arr[i] = num;
			}
			
			System.out.println("Enter the position of the element to be replicated");
			
			int position = sc.nextInt();
			
			for (int i = 0; i < modified_arr.length; i++) {
				if(i == position + 1) {
					modified_arr[i] = arr[position];
				}else {
					if(i > position + 1) {
						modified_arr[i] = arr[i-1];
					}else {
						modified_arr[i] = arr[i];
					}
				}
			}
			
			return Arrays.toString(modified_arr).replaceAll(",", "").replace("[", "").replace("]", "");
			
		}catch(InputMismatchException e) {
			return "Input was not in the correct format";
		}catch(ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		if(size == -1)
			System.out.println("Array size should be positive");
		else {
			int[] arr = new int[size];
			
			System.out.println("The array elements are " + getDuplicateElement(arr));
		}	

	}

}
