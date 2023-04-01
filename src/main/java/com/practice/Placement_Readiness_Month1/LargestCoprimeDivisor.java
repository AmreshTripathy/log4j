package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=jK0l6RcRVKg
 * https://course.acciojob.com/idle?question=07b30403-d04c-42f7-b610-8d5d3cac4b15
 */

import java.util.Scanner;

public class LargestCoprimeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        System.out.println(cpFact_BFA(A, B));
        System.out.println(cpFact_Optimized(A, B));
    }

    // Brute Force Approach
    private static int cpFact_BFA(int A, int B) {

        // conditions : A % X = 0 & gcd(X, B) = 1;

        // Applying for loop for first condition

        int ans = 1;
        for (int i = 2; i <= A; i++) {
            if (A % i == 0 && gcd(i, B) == 1) {
                ans = i;
            }
        }

        return ans;
    }

    // Optimized Approach
    private static int cpFact_Optimized(int A, int B) {
        // we are gonna find the gcd of A & B
        // and check whether their gcd is 1 or not

        // here our first condition is already satis fied satisfied means A % X = 0
        int temp = gcd(A, B);

        while (temp != 1) {
            A /= temp;
            temp = gcd(A, B);
        }

        return A;
    }

    private static int gcd(int i, int B) {
        int min = Math.min(i, B);

        for (int j = 2; j <= min; j++) {
            if (i % j == 0 && B % j == 0) {
                return j;
            }
        }

        return 1;
    }
}
