package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=57531c66-6db6-46df-a636-7b5c1a24662d
 */

import java.util.Scanner;

public class PlaceTheItemsInBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        combinations(N, R);
    }

    private static void combinations(int n, int r) {
        helper(1, n, 1, r, "");
    }

    private static void helper(int i, int n, int j, int r, String path) {
        if (i > n) {
            String temp = path;

            if (r != (temp.length() - temp.replace("i", "").length()))
                return;

            System.out.println(path);
            return;
        }

        helper(i + 1, n, j + 1, r, path + "i");
        helper(i + 1, n, j, r, path + "-");
    }
}
