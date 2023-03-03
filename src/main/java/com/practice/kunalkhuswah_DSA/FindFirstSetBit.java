package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9fb17bdd-a5e6-476b-873f-0d456d8c8c78
 */

import java.io.IOException;
import java.util.Scanner;

public class FindFirstSetBit {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = solve(n);
        System.out.println(ans);
        sc.close();
    }

    private static int solve(int n) {
        int k = 0;
        while ((n & (1 << k)) == 0)
            k++;

        return k + 1;
    }

}
