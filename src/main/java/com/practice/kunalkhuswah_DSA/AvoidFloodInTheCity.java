package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=7f1d060f-853b-4494-8658-62e068d2afe8
 * https://leetcode.com/problems/avoid-flood-in-the-city/description/
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class AvoidFloodInTheCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        System.out.println(Arrays.toString(avoidFlood(arr)));
    }

    private static int[] avoidFlood(int[] rains) {
        int ans[] = new int[rains.length];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        TreeSet<Integer> dry = new TreeSet<>();

        for (int i = 0; i < rains.length; i++) {
            int lake = rains[i];
            if (lake == 0) {
                dry.add(i);
                ans[i] = 1; // for default case we put 1 for 0 
            } else if(map.containsKey(lake) == false) {
                map.put(lake, i);
                ans[i] = -1;
            } else {
                // this lake needs to dry otherwise flood will happen
                Integer id = map.get(lake);
                ans[i] = -1; // because it's not the dry day we are adding -1
                Integer dryDay = dry.higher(id); // in an Integer wrapper class an int value can be null
                // dry.higher(id) --> it gives the number above it
                if(dryDay == null)
                    return new int[0];

                ans[dryDay] = lake;
                dry.remove(dryDay);
                map.put(lake, i);
            }
        }

        return ans;
    }
}
