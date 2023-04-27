package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=c620cdd9-b518-4e50-829d-a545c035e5e7
 * https://www.youtube.com/watch?v=-qrpJykY2gE
 */

import java.util.Scanner;

public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        sc.close();
        System.out.println(rangeBitwiseAnd(left, right));
    }

    private static int rangeBitwiseAnd(int left, int right) {

        // Logically it is confirmed that a bit flip means all the right bits of that
        // bit are changed within that range & if we find any bit are same than all the
        // left bit's are same

        // Ex: 16 -> 10000
        // 19 -> 10011
        // --------
        // left 100 is fixed, and right two bits are flipped
        // so ans -> 10000

        int count = 0;

        while (left != right) {
            left >>= 1;
            right >>= 1;
            count++;
        }

        return left <<= count;
    }
}
