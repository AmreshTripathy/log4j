package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/ipo/description/
 * https://course.acciojob.com/idle?question=d143bbcb-fe59-42ea-9630-9ce8e7165b4a
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class IPO {
    public static void main(String[] args) {
        int n, k, w;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int profit[] = new int[n];
        int capital[] = new int[n];

        for (int i = 0; i < n; i++)
            profit[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            capital[i] = sc.nextInt();

        k = sc.nextInt();
        w = sc.nextInt();

        sc.close();
        System.out.println(findMaximizedCapital(n, profit, capital, k, w));
    }

    private static int findMaximizedCapital(int n, int[] profit, int[] capital, int k, int w) {
        // We need to sort capital according to capital then add profits to those are
        // less than w

        // Using prioritqueue
        // sorting capitals in ascending order
        PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // sorting profit in descending order
        PriorityQueue<int[]> pqPro = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        // adding profit and capital pair wise
        for (int i = 0; i < n; i++)
            pqCap.add(new int[] { capital[i], profit[i] });

        // we can almost take k projects
        for (int i = 0; i < k; i++) {
            // checking for capacity those are less than w
            // because we start an project if that projects capital is less than or equal to
            // availble capital
            while (pqCap.size() > 0 && pqCap.peek()[0] <= w) {
                pqPro.add(pqCap.poll());
            }

            if (pqPro.isEmpty())
                break;

            w += pqPro.poll()[1];
        }

        return w;
    }
}
