package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=99b2b8d9-d830-4b9a-a61d-25dc5bc94ab4
 */

import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {

        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = (n >> 1);
        }

        return count;
    }
}
