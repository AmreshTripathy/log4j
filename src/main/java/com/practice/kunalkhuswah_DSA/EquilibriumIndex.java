package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=ca688309-71a6-4c7a-8a45-07ad8817a350
 */

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        int ans = findEquilibriumIndex(arr);
        System.out.println(ans);
    }

    private static int findEquilibriumIndex(int[] arr) {

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int sum = 0;

        // adding sum in the map index wise
        for (int i = 0; i < n; i++) {
            map.put(i, sum);
            sum += arr[i];
        }

        // here calulating the right sum and checking whether it's matching with left sum(key wise index -> sum)
        for (int i = 0; i < n; i++) {
            int rightMinus = sum - map.get(i) - arr[i];
            if(map.get(i) == rightMinus)
                return i;
        }


        return -1;
    }
}
