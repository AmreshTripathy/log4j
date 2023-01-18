package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=90be5b8c-a34c-4e31-8945-2c380abce3a2
 * https://leetcode.com/problems/group-anagrams/description/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }

    private static void printAnagramsTogether(String wordArr[], int size) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : wordArr) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String charCountStr = String.valueOf(arr);

            if (!map.containsKey(charCountStr))
                map.put(charCountStr, new ArrayList<String>());

            List<String> lis = map.get(charCountStr);
            lis.add(s);
            map.put(charCountStr, lis);
        }

        TreeMap<String, List<String>> sortedMap = new TreeMap<>(map);

        List<List<String>> list = new ArrayList<>(sortedMap.values());

        for (List<String> l : list)
            for (String s : l)
                System.out.print(s + " ");
    }
}
