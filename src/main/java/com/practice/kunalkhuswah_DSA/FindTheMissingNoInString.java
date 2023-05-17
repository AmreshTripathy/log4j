package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://practice.geeksforgeeks.org/problems/find-the-missing-no-in-string/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
 */

import java.util.Scanner;

public class FindTheMissingNoInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(missingNumber(s));
    }

    private static int missingNumber(String s) {
        int limit = 6;
        int i = 0;
        int lastNine = 9;

        while (i <= limit) {
            if (s.length() < 2 * (i + 1))
                break;
            int first = Integer.parseInt(s.substring(0, i + 1));
            int second = Integer.parseInt(s.substring(i + 1, 2 * (i + 1)));

            if (first == lastNine && s.charAt(i + 2) == '0') {
                second = Integer.parseInt(s.substring(i + 1, 2 * (i + 1) + 1));
                if (first == second - 1) {
                    int ans = findNumber(i + 1, s);
                    if (ans == -1) {
                        i++;
                    } else {
                        return ans;
                    }
                } else if (first == second - 2) {
                    return first + 1;
                } else {
                    i++;
                }
            }

            lastNine = (lastNine * 10) + 9;
            if (first > second) {
                i++;
                continue;
            }

            if (first == second - 1) {
                int ans = findNumber(i + 1, s);
                if (ans == -1) {
                    i++;
                } else {
                    return ans;
                }
            } else if (first == second - 2) {
                return first + 1;
            } else {
                i++;
            }
        }

        return -1;
    }

    private static int findNumber(int len, String s) {
        int ans = -1;
        String temp = "";
        for (int i = 0; i < len; i++)
            temp += 9;

        int limit = Integer.parseInt(temp);
        int i = 0;

        while (len <= 6 && (i + len) < s.length()) {
            int first = Integer.parseInt(s.substring(i, i + len));
            int second;
            if (first == limit) {
                int previousPosition = i + len;
                len += 1;
                limit = (limit * 10) + 9;
                second = Integer.parseInt(s.substring(previousPosition, previousPosition + len));
                i = previousPosition;
            } else {
                second = Integer.parseInt(s.substring(i + len, i + (2 * len)));
                i += len;
            }

            if (first + 1 == limit && limit != second) {
                return limit;
            }

            if (first == second - 2) {
                if (ans != -1) {
                    return -1;
                }
                ans = first + 1;
            } else if (first != second - 1) {
                return -1;
            }
        }

        return ans;
    }
}
