package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PageRangeCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();
        List<String> lis = pageMenu(arr, n);
        for (int i = 0; i < lis.size(); i++) {
            if (i == lis.size() - 1) {
                System.out.println(lis.get(i));
            } else {
                System.out.print(lis.get(i) + ", ");
            }
        }
    }

    private static List<String> pageMenu(int[] arr, int n) {

        int j = arr[0];
        List<String> lis = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + 1 != arr[i]) {
                String s = (j == arr[i - 1]) ? String.valueOf(j) : j + "-" + arr[i - 1];
                lis.add(s);
                j = arr[i];
            }
        }

        String s = (j == arr[n - 1]) ? String.valueOf(j) : j + "-" + arr[n - 1];
        lis.add(s);

        return lis;
    }
}
