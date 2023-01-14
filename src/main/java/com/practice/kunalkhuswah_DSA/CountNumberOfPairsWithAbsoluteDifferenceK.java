package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c47351e9-e120-488d-a193-0fdc5ab7a56b
 */

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        sc.close();

        System.out.print(pairDifference(A, n, k));
    }
    
    private static long pairDifference(int[] A, int n, int k) {
    	int numOfPairs = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : A){
            map.put(i, map.containsKey(i) ? 2 : 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int i = e.getKey();

            //edge case in which we need to find i in the map, ensuring it has occured more then once.
            if(k == 0)
                numOfPairs = numOfPairs + (map.get(i) == 2 ? 1 : 0);

            else if(map.containsKey(i-k))
                numOfPairs++;
        }
        return numOfPairs;
    }
}
