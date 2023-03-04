package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=bb7d3ad1-d2b7-4f65-8268-94e1d64a2ef3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MinimumCostOfRopes {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        Integer nextInt() {
            return Integer.parseInt(next());
        }

        Long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();
        out.println(minCost(arr, n));
        out.flush();
    }

    private static long minCost(long arr[], int n) {
        // adding priority qieue to find the minimum sum
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long sum = 0;
        for (long x : arr)
            pq.add(x);

        while (pq.size() > 1) {
            long a = pq.remove();
            long b = pq.remove();

            sum += (a + b);
            pq.add(a + b);
        }

        return sum;
    }
}
