package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=f2de87a9-3254-4fad-a157-e5194ac90f1c
 */

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println(reverse(n));
    }

    public static long reverse(long A) {
        // Your code here

        long rev = 0;
        int j = 31;

        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            if ((A & mask) != 0) {
                long smask = (1l << j);
                rev |= smask;
            }
            j--;
        }

        return rev;
    }
}
