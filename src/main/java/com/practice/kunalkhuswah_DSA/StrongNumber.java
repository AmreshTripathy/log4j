package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=fb2f1827-ee63-4774-95fd-b9aae8981101
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        br.close();
        if (strongNumbers(n))
            System.out.println(1);
        else
            System.out.println(0);
    }

    private static boolean strongNumbers(long n) {

        long temp = n;
        Set<Integer> set = new HashSet<Integer>();

        while (n % 2 == 0) {
            set.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        if (n > 2) {
            set.add((int) n);
        }

        for (int num : set) {
            if (temp % Math.pow(num, 2) != 0)
                return false;
        }

        return true;
    }
}
