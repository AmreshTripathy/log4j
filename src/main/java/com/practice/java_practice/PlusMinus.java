package com.practice.java_practice;

import java.util.Scanner;

class PlusMinus {

     /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		String[] arrItems = sc.nextLine().split(" ");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0;i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		
		plusMinus(arr);
		
	}
	
    public static void plusMinus(int[] arr) {
        float positive = 0;
        float negative = 0;
        float zero =0;
        for(int i = 0; i<= arr.length; i++){
            if(arr[i] > 0){
                positive++;
            }else if(arr[i] < 0){
                negative++;
            }else {
                zero++;
            }
        }
        
        System.out.println(positive / arr.length);
        System.out.println(negative / arr.length);
        System.out.println(zero / arr.length);
        
    }

}
