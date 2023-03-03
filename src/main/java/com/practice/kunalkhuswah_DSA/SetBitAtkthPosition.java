package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b3c0efae-c232-43fe-818f-4df46e7c0214
 */

import java.util.Scanner;

public class SetBitAtkthPosition {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(setKBit(n, k));
    }

    public static int setKBit(int n, int k) {
        // write code here
        return n | (1 << k);
    }
}
