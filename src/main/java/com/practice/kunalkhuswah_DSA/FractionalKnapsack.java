package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6575e0e7-62c8-4b89-a52d-e6da7e7afcef
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    static class Item {
        int value, weight;

        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        Item arr[] = new Item[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr[i] = new Item(value, 0);
        }
        for (int i = 0; i < n; i++) {
            arr[i].weight = sc.nextInt();
        }
        sc.close();
        double ans = fractionalKnapsack(w, arr, n);
        System.out.println(String.format("%.2f", ans));
    }

    private static double fractionalKnapsack(int capacity, Item arr[], int n) {

        // calculatring profit / wait ration and sorting according to that
        Arrays.sort(arr, (a, b) -> {
            double pwra = (double) (1.0 * a.value / a.weight);
            double pwrb = (double) (1.0 * b.value / b.weight);

            return pwra > pwrb ? -1 : 1;
        });

        double ans = 0.0;

        for (int i = 0; i < n; i++) {
            if (capacity >= arr[i].weight) {
                ans += arr[i].value;
                capacity -= arr[i].weight;
            } else {
                ans += (double) (1.0 * arr[i].value / arr[i].weight) * (1.0 * capacity);
                capacity = 0;
                break;
            }
        }

        return ans;
    }
}
