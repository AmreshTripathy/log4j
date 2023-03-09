package com.practice.acciojob;
/*
 * @Amresh Tripathy
 * https://practice.geeksforgeeks.org/problems/word-boggle4143/1
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordBoggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dictionary = new String[n];

        for (int i = 0; i < n; i++)
            dictionary[i] = sc.next();

        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] board = new char[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                board[i][j] = sc.next().charAt(0);

        sc.close();

        String[] found = wordBoggle(board, dictionary);
        System.out.println(Arrays.toString(found));
    }

    private static String[] wordBoggle(char[][] board, String[] dictionary) {

        // storing the size of board length
        int n = board.length;
        int m = board[0].length;

        // checking string one by one int the dictionary
        // if found adding it to set
        Set<String> ans = new HashSet<>();
        
        for (String s : dictionary) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dfs (s, i, j, n, m, board, 0)) {
                        ans.add(s);
                    }
                }
            }
        }

        String[] arr = new String[ans.size()];
        int i = 0;
        for (String s : ans)
            arr[i++] = s;

        return arr;
    }

    private static boolean dfs(String s, int i, int j, int n, int m, char[][] board, int idx) {

        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        if (s.charAt(idx) != board[i][j])
            return false;

        if (idx == s.length() - 1)
            return true;

        char temp = board[i][j];
        board[i][j] = '*';

        // checking for 8 directions with increasing idx
        
        boolean a = dfs(s, i - 1, j, n, m, board, idx + 1); // up
        boolean b = dfs(s, i + 1, j, n, m, board, idx + 1); // down
        boolean c = dfs(s, i, j - 1, n, m, board, idx + 1); // left
        boolean d = dfs(s, i, j + 1, n, m, board, idx + 1); // right
        boolean e = dfs(s, i - 1, j - 1, n, m, board, idx + 1); // top left
        boolean f = dfs(s, i - 1, j + 1, n, m, board, idx + 1); // top right
        boolean g = dfs(s, i + 1, j - 1, n, m, board, idx + 1); // bottom left
        boolean h = dfs(s, i + 1, j + 1, n, m, board, idx + 1); // bottom right

        board[i][j] = temp;

        return a || b || c || d || e || f || g || h;
    }
}
