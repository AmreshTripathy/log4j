package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=0510f2c8-192b-4a6c-8415-ff9536159105
 */

import java.util.Scanner;

public class RangeStringShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // System.out.print(s);
        int m;
        m = sc.nextInt();
        int store[][] = new int[m][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                store[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(shiftingLetters(s, store));
    }

    private static String shiftingLetters(String s, int[][] shifts) {

        char[] arr = s.toCharArray();

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if (direction == 0) {
                // backward
                for (int i = start; i <= end && i < arr.length; i++) {
                    arr[i] = (char) ((arr[i] - 1 < 'a') ? (arr[i] - 1) + 26 : arr[i] - 1);
                }
            }

            if (direction == 1) {
                // forward
                for (int i = start; i <= end && i < arr.length; i++) {
                    arr[i] = (char) ((arr[i] + 1 > 'z') ? (arr[i] + 1) - 26 : arr[i] + 1);
                }
            }
        }

        return new String(arr);
    }
}
