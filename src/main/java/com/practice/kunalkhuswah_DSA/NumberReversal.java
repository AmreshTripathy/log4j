package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
        sc.close();
    }
}
