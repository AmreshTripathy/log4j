package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=3wUa7Lf1Xjk
 * https://course.acciojob.com/idle?question=59126924-703f-403a-8af9-821d06e3c75a
 */

import java.util.Scanner;

public class CircularTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] petrol = new int[n];
        int[] distance = new int[n];
        
        for(int i = 0; i < n; i++) petrol[i] = sc.nextInt();
        for(int i = 0; i < n; i++) distance[i] = sc.nextInt();
        sc.close();

        System.out.println(tour(petrol, distance));
    }

    private static int tour(int[] petrol, int[] distance) {
        // here we are checking petrol - distance
        // if difference is +ve starting point is the current index;
        // else index + 1
        // totalSum is >= 0 return position or -1
        int position = 0, sum = 0, total = 0;

        for(int i = 0; i < petrol.length; i++) {
            sum += petrol[i] - distance[i];
            if(sum < 0) {
                total += sum;
                position = i + 1;
                sum  = 0;
            }
        }

        total +=  sum;
        return (total >= 0) ? position : -1;
    }
}
