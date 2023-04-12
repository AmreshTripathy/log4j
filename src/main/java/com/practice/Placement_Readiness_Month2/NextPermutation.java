package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/next-permutation/
 * https://course.acciojob.com/idle?question=98f32292-cfdb-45de-8d1d-1597b161e0d9
 */

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sc.close();

        System.out.println(Arrays.toString(nextPermutation(arr)));
    }

    private static int[] nextPermutation(int[] arr) {

        int n = arr.length;

        // find the element from which we need to change
        int pivot = findPivotElement(arr, n);

        // finding next greater element of pivot element
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return arr;
        }
        int nextIncreasedInteger = findJustNextBiggerNumber(arr, n, pivot);

        // swap the numbers and then reverse
        swap(arr, pivot, nextIncreasedInteger);
        reverse(arr, pivot + 1, n - 1);

        return arr;
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findPivotElement(int[] arr, int n) {

        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i])
                return i - 1;
        }

        return -1;
    }

    private static int findJustNextBiggerNumber(int[] arr, int n, int pivot) {

        int i = n - 1;
        while (i > pivot) {
            // traversing upto the elements that are smaller
            if (arr[pivot] >= arr[i])
                i--;
            else
                break;
        }
        return i;
    }
}
