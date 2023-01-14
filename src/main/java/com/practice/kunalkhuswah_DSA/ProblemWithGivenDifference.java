package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=803b4abc-3829-4b3b-9dab-74da720ff06a
 */

public class ProblemWithGivenDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; i++) A[i] = sc.nextInt();

        int B = sc.nextInt();
        sc.close();
        System.out.println(givenDifference(A, n, B));
    }

    private static int givenDifference(int[] A, int n, int B) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++)
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

        for(int i = 0; i < n; i++)
            if(map.containsKey(A[i] - B))
                return 1;

        return 0;
    }
}
