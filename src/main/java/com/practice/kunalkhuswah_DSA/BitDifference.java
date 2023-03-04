package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=3fd366a0-7de5-4740-853f-b10f7dcf34ab
 */

import java.util.Scanner;

public class BitDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(countBitsFlip(a,b));
        sc.close();
    }

    public static int countBitsFlip(int a, int b){
        // Your code here
        int count = 0;

        while (b > 0 || a > 0) {
            if (((b & 1) > 0) && ((a & 1) == 0))
                count++;
            else if (((b & 1) == 0) && ((a & 1) > 0))
                count++;
                
            b >>= 1;
            a >>= 1;
        }

        return count;
     }
}
