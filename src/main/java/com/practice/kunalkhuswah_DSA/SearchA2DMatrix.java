package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=e469460a-11cf-480b-b950-02efad208e6b
 */

import java.util.Scanner;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        sc.close();
        if(searchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean searchA2DMatrix(int[][] mat, int x) {
        int lo = 0;
        int hi = mat.length * mat[0].length - 1;
        int cl = mat[0].length;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            // calculate the index of row and column
            // row = mid / total_column
            // col = mid % total_column
            int midElement = mat[mid / cl][mid % cl];
            int lowElement = mat[lo / cl][lo % cl];

            if(midElement == x)
                return true;
            else if(lowElement <= x && x <= midElement)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        
        return false;
    }
}
