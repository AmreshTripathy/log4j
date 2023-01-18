package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=37687b64-5577-4a0d-a55a-30c17ebddb66
 */

import java.util.Scanner;

public class PrimeFactorOfAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        primeFactor(n);
    }

    private static void primeFactor(int n) {
        
        while(n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if(n > 2)
            System.out.print(n + " ");
    }
}
