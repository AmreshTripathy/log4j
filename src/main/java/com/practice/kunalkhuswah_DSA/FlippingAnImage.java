package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class FlippingAnImage {
    protected static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][]  mat = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        System.out.println(Arrays.deepToString(flipAndInvertImage(mat)));
    }

    private static int[][] flipAndInvertImage(int[][] mat) {
        int n =  mat.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            	if(mat[i][j] == 1) {
            		arr[n-1-j] = 0;
            	}else {
            		arr[n-1-j] = 1;
            	}
            }
            
            for(int j = 0; j < n; j++) {
            	mat[i][j] = arr[j];
            }
            arr = new int[n];
        }


        return mat;
    }
}
