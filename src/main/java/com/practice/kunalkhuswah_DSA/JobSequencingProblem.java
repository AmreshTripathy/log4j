package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=9b4489bb-7feb-4371-9851-5ca0e1ec56a8
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JobSequencingProblem {

    static class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputLine[] = br.readLine().trim().split(" ");

        int n = Integer.parseInt(inputLine[0]);
        Job[] arr = new Job[n];
        inputLine = br.readLine().trim().split(" ");

        // adding id, deadline, profit
        for (int i = 0, k = 0; i < n; i++) {
            arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]),
                    Integer.parseInt(inputLine[k++]));
        }

        // function call
        int[] res = solve(arr, n);
        System.out.println(res[0] + " " + res[1]);

    }

    private static int[] solve(Job arr[], int n)
    {
        boolean[] days = new boolean[n + 1];

        int cnt = 0;
        int totalProfit = 0;

        // sorting array in descending order
        Arrays.sort(arr, (a, b) -> {
            return b.profit - a.profit;
        });

        for (int i = 0; i < n; i++) {
            int bestPossibleDay = arr[i].deadline;
            while (bestPossibleDay > 0 && days[bestPossibleDay] == true) {
                bestPossibleDay--;
            }

            // if bestPossibleDay == 0, means there is no possible day to do this job
            if (bestPossibleDay == 0)
                continue;
            days[bestPossibleDay] = true;
            cnt++;
            totalProfit += arr[i].profit;
        }
        int[] ans = {cnt, totalProfit};
        return ans;
    }
}
