package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=4f933ef9-bfa1-4337-8c11-98c928b4dd05
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinXorValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++)
            A.add(sc.nextInt());

        sc.close();
        System.out.println(findMinXor(A));
    }

    private static int findMinXor(ArrayList<Integer> A) {

        // Brute force approach
        // ArrayList<Integer> lis = new ArrayList<>();
        // int n = A.size();

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         lis.add(A.get(i) ^ A.get(j));
        //     }
        // }

        // Collections.sort(lis);
        // return lis.get(0);

        // -----------------------------------------------------

        // otimize approach is sort the array List
        // so after sort we can say that from the immidiate next elemnts we can get the min xor value
        // ex: 0 4 3 2 1 -> 0 1 2 3 4 -> now find xor between pair 0 1, 1 2, 2 3, 3 4;

        Collections.sort(A);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < A.size(); i++) {
            min = Math.min(min, A.get(i - 1) ^ A.get(i));
        }

        return min;
    }
}
