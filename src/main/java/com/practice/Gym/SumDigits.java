package com.practice.Gym;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=70136cad-6f31-4773-99c9-8be8a9b5e447
 */

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); 
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        // Your code here
            return (n == 0) ? 0 : n % 10 + sumDigits(n / 10);
    }
}
