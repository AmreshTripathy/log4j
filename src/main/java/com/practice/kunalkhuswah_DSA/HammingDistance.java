package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=12d2dd11-e9fb-4870-bd10-49a21a1f19a2
 */

import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = hammingDistance(a,b);
        System.out.println(ans);
        sc.close();
    }

    private static int hammingDistance(int a, int b) {
        // we are counting set bits after xor of a and b

        int r = a ^ b;
        int count = 0;

        while (r > 0) {
            if ((r & 1) > 0)
                count++;
            
            r >>= 1;
        }

        return count;
    }
}
