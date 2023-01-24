package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=09b7009d-eb26-4479-a937-ab55d1e0d784
 */

import java.util.Scanner;

public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        sc.close();
        System.out.println(MinimumPages(A, B));
    }

    private static long MinimumPages(int[] A, int B) {
        // first define sample space for capacity of max pages to a student
        // lo -> max element in the array, as if we divide all books to n students than
        // maximum pages
        // in a permutation to a student will be max element of an array.
        // hi -> sum of all elements in the array, as if we divide all books to a single
        // then, maximum pages
        // will be sum of the pages.
        if(A.length < B)
            return -1;

        long lo = A[0];
        long hi = A[0];

        for (int i = 1; i < A.length; i++) {
            lo = Math.max(lo, A[i]);
            hi += A[i];
        }

        long res = -1;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            // If I am able to distribute these books to B or less than B students then,
            // these books are distributed
            if (possibleToPlace(A, B, mid) == true) {
                res = mid;

                // move towards small capacity
                hi = mid - 1;
            } else {
                // move towards big capacity
                lo = mid + 1;
            }
        }

        return res;
    }

    private static boolean possibleToPlace(int[] A, int B, long cap) {
        int student = 1;
        int curretPagesCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (curretPagesCount + A[i] <= cap) {
                curretPagesCount += A[i];
            } else {
                curretPagesCount = A[i];
                student++;
            }
        }

        return (student <= B);
    }
}
