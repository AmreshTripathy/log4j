package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=bef05518-ca74-4dc9-b0c7-b3a3a0c4475d
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindTheRepeatingAndMissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(findRepeatingAndMissingNumbers(nums)));
	}

	private static int[] findRepeatingAndMissingNumbers(int[] nums) {
		int[] ans = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : nums)
			map.put(num, map.getOrDefault(num, 0) + 1);

		List<Integer> lis = new ArrayList<Integer>(map.keySet());
		Collections.sort(lis, Collections.reverseOrder());

		for (int num : lis) {
			if (map.get(num) > 1)
				ans[0] = num;
			if (num > 1 && map.containsKey(num - 1) == false) {
				ans[1] = num - 1;
			}
		}

		if(ans[1] == 0)
			ans[1] = lis.get(0) + 1;

		return ans;
	}
}
