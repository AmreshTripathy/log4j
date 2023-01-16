package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=88702d43-c618-4743-b087-68a584856481
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RabbitsInForest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(numRabbits(arr));
    }

    private static int numRabbits(int[] arr) {

        int ans = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // first count the numbers
        for(int num: arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for(int key: map.keySet()) {
            int color = key + 1;

            int group = map.get(key) / color; // checking total groups
            if(map.get(key) % color > 0) // checking if there is break group present
                group++;
            
            ans += color * group;
        }

        return ans;
    }
}
