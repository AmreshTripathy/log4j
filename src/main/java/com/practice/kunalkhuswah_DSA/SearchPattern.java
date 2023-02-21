package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=7e2f8ed3-69ab-4d0c-ad56-467a99335a5b
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SearchPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        ArrayList<Integer> ans = FindIndices(a, b);
        for(int x : ans)
            System.out.print(x + " ");
    }

    private static ArrayList<Integer> FindIndices(String a, String b) {
        ArrayList<Integer> lis = new ArrayList<>();

        int idx = 0;
        while(a.indexOf(b, idx) >= 0) {
            int index = a.indexOf(b, idx);
            lis.add(index + 1);
            idx = index + 1;
        }

        if(lis.isEmpty())
            lis.add(-1);

        return lis;
    }
}
