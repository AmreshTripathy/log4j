package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=fc94cc5e-7796-4534-9ada-abc2b7ed2938
 */

import java.util.Scanner;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int qq = 0; qq < q; qq++){
            long n = input.nextLong();
            System.out.println(flipBits(n));
        }
        input.close();
    }

    private static long flipBits(long n) {

        // first creating a 32 size long number because integer has only 32bit signed numbers
        long bitMask = (1L << 32) - 1;
        return n ^ bitMask;
    }
}
