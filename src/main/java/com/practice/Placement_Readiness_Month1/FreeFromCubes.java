package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ad209648-3f41-4de1-8f5b-43f27c00d9fe
 */

import java.util.Scanner;

public class FreeFromCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = isCubeFree(n);
        System.out.println(ans);
    }

    static int isCubeFree(int n) {

        if (n == 1)
            return 1;

        if (!isNotCubic(n))
            return -1;

        int index = 1;

        for (int i = 2; i <= n; i++) {
            if (isNotCubic(i)) {
                index++;
            }
        }

        return index;
    }

    private static boolean isNotCubic(int n) {

        for (int i = 2; i * i * i <= n; i++) {
            if (n % (i * i * i) == 0)
                return false;
        }

        return true;
    }
}
