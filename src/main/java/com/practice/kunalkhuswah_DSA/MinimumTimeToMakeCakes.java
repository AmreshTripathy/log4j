package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=d203d755-cbed-4c79-910b-d77dec37f33b
 */

import java.util.Scanner;

public class MinimumTimeToMakeCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int ans = minDays(A, n, m, k);
        System.out.println(ans);
    }

    public static int minDays(int[] bloomDay,int n, int m, int k) {
		int lo = 1;
        int hi = 0;

        for(int ele: bloomDay)
            hi = Math.max(hi, ele);
        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if(isPossible(bloomDay, m, k, mid)) {
                ans = mid;
                hi = mid - 1;
            }else
                lo = mid + 1;
        }

        return ans;
	}

    private static boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int flavours = 0;
        int cakeCount = 0;

        for (int ele: bloomDay) {
            if(ele <= mid) {
                flavours++;
                if (flavours == k) {
                    cakeCount++;
                    flavours = 0;
                }
                if (cakeCount == m)
                    return true;
            }else
                flavours = 0;
        }
        return false;
    }
}
