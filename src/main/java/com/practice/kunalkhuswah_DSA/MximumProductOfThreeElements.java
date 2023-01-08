package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MximumProductOfThreeElements {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        
        System.out.println(maxProd(arr1, n));
	}
	
	static int maxProd(int arr[], int n)
    {
        int max= 0;
        // for(int i =0; i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //         for(int k = j+1; k < n; k++){
        //             int ele = arr[i] * arr[j] * arr[k];
        //             if(max < ele)
        //                 max = ele;
        //         }
        //     }
        // }
        Arrays.sort(arr);

        max = (int) Math.max(arr[0] * arr[1] * arr[n-1], arr[n-1] * arr[n-2] * arr[n-3]);
        
        return max;
    }
}
