package com.practice.Gym;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b694f49e-6365-4f13-8d3f-4b1ec0455043
 */

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
