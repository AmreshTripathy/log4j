package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://codeforces.com/contest/1382/problem/C2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrefixFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        sc.close();

        solve(a, b, n);
    }

    private static void solve(String a, String b, int n) {
        List<Integer> lis1 = new ArrayList<>();
        List<Integer> lis2 = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1))
                lis1.add(i + 1);
            if (b.charAt(i) != b.charAt(i + 1))
                lis2.add(i + 1);
        }

        if (a.charAt(n - 1) != b.charAt(n - 1))
            lis1.add(n);

        System.out.print((lis1.size() + lis2.size()) + " ");
        for (int i = 0; i < lis1.size(); i++)
            System.out.print(lis1.get(i) + " ");

        for (int i = lis2.size() - 1; i >= 0; i--)
            System.out.print(lis2.get(i) + " ");
    }
}
