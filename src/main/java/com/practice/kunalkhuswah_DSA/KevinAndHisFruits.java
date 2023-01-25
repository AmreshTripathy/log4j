package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9fa66613-25ce-4390-99a0-d3ae2f3825ba
 */

import java.util.ArrayList;
import java.util.Scanner;

public class KevinAndHisFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        sc.close();
        int ans = getMaxMarker(arr, n, m);
        System.out.println(ans);
    }

    private static int getMaxMarker(ArrayList<Integer> arr, int n, int m) {
        int lo = 0;
        int hi = 0;

        for(int ele: arr)
            hi =  Math.max(hi, ele);
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if(possibleToEat(arr, mid, m) == true) {
                ans = mid;
                lo = mid + 1;
            }else
                hi = mid - 1;
        }
        return ans;
    }

    private static boolean possibleToEat(ArrayList<Integer> arr, int mid, int m) {
        int sum = 0;

        for(int ele: arr) {
            if(ele > mid)
                sum += ele - mid;
            if(sum >= m)
                return true;
        }
        return false;
    }
}
