package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=71891482-69b9-4bd3-a1ae-1945179ee04f
 */

import java.util.Scanner;

public class SquareRootOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sqrt(n);
    }

    private static void sqrt(int A) {
        long lo = 1;
        long hi = A;
        long pre = 0;
        while(lo <= hi) {
            long mid = (lo + hi) / 2;

            long prod = mid * mid;
            if(prod == A) {
				System.out.println(mid);
                return;
			}else if(prod < A) {
                pre = mid;
                lo = mid + 1;
            }else {
                hi = mid - 1;
            }
        }

        System.out.println(pre);
    }
}
