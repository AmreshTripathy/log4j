package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a9053e1c-c112-4494-b77d-6c22f107cee2
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WordSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char board[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                board[i][j] = sc.next().charAt(0);
        }
        sc.nextLine();
        int l = sc.nextInt();
        String word[] = new String[l];
        sc.nextLine();
        for (int i = 0; i < l; i++) {

            word[i] = sc.nextLine();

        }
        List<String> ans = solve(board, word);
        for (int i = 0; i < ans.size(); i++)
            System.out.println(ans.get(i));

        sc.close();
    }

    public static List<String> solve(char board[][], String[] words) {
        // Same approach as wordboogle question

        Set<String> set = new HashSet<>();

        int n = board.length;
        int m = board[0].length;

        for (String str : words) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dfs(str, i, j, n, m, board, 0)) {
                        set.add(str);
                    }
                }
            }
        }

        List<String> ans = new ArrayList<>(set);

        Collections.sort(ans);
        return ans;
    }

    private static boolean dfs(String str, int i, int j, int n, int m, char[][] board, int idx) {

        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        if (str.charAt(idx) != board[i][j])
            return false;

        if (idx == str.length() - 1)
            return true;

        char temp = board[i][j];
        board[i][j] = '*';

        boolean left = dfs(str, i, j - 1, n, m, board, idx + 1);
        boolean top = dfs(str, i - 1, j, n, m, board, idx + 1);
        boolean right = dfs(str, i, j + 1, n, m, board, idx + 1);
        boolean bottom = dfs(str, i + 1, j, n, m, board, idx + 1);

        board[i][j] = temp;

        return left || top || right || bottom;
    }
}
