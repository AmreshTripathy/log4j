package com.practice.coinswitch;

public class MaxElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findLargest(nums, 5));
    }

    private static int findLargest(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right])
                right = mid - 1;
            else
                left = mid;
        }
        
        return nums[(left - k + 1 < 0) ? n + (left - k + 1) : left - k + 1];
    }
}
