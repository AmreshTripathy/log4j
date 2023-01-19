package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=QPfalDbqa4A
 * https://course.acciojob.com/idle?question=357fe3fe-d5d6-4a39-abc2-9f6060497eac
 */

import java.util.Scanner;

public class MaximumOnesAfterModification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        
        int B = sc.nextInt();
        sc.close();
        System.out.println(longestOnes(A, B));
    }

    private static int longestOnes(int[] A, int B) {
        int ans = 0;

        int count = 0;
        int j = -1; // taking j for excluding elements from the array index wise
        for(int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                count++;
            
            // if count > B remove the elements upto which j not finds zero and decrease count
            while (count > B) {
                j++;
                if (A[j] == 0)
                    count--;
            }
            int len = i - j;
            ans = Math.max(ans, len);
        }

        return ans;
    }
}
