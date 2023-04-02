package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=1b1fdc6c-da28-41f0-9c2e-7360810c490d
 */

import java.io.*;
import java.util.*;

public class BombermanGame {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int n = sc.nextInt();

        List<String> grid = new ArrayList<>();
        for (int i = 0; i < r; i++)
            grid.add(sc.next());

        sc.close();

        grid = bomberMan(n, grid);

        for (String str : grid)
            System.out.println(str);
    }

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        int r = grid.size();
        int c = grid.get(0).length();

        if (n == 1)
            return grid;

        // all cells filled with bombs
        if (n % 2 == 0)
            return charToGrid(allZeroGrid(r, c));

        // alternates states
        n /= 2; // checking for odd number linke 5 & 9

        char[][] ans = blastBomb(gridToChar(grid), r, c);

        // ex: 5 / 2 = 2 % 2 == 0, So we need to do one additional blast
        if (n % 2 == 0) {
            ans = blastBomb(ans, r, c);
        }

        return charToGrid(ans);
    }

    private static List<String> charToGrid(char[][] ans) {

        List<String> grid = new ArrayList<>();

        for (char[] ele : ans) {
            grid.add(String.valueOf(ele));
        }

        return grid;
    }

    private static char[][] blastBomb(char[][] bombs, int r, int c) {

        char[][] result = allZeroGrid(r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (bombs[i][j] == 'O') {
                    detonateBomb(result, i, j, r, c);
                }
            }
        }

        return result;
    }

    private static void detonateBomb(char[][] result, int i, int j, int r, int c) {
        int[] x = { 0, 0, -1, 0, 1 }; // base, left, top, right, bottom
        int[] y = { 0, -1, 0, 1, 0 };

        for (int z = 0; z < 5; z++) {
            int cur_x = i + x[z];
            int cur_y = j + y[z];

            if (cur_x >= 0 && cur_y >= 0 && cur_x < r && cur_y < c) {
                result[cur_x][cur_y] = '.';
            }
        }
    }

    private static char[][] allZeroGrid(int r, int c) {
        char[][] temp = new char[r][c];

        for (int i = 0; i < r; i++) {
            temp[i] = new char[c];
            Arrays.fill(temp[i], 'O');
        }

        return temp;
    }

    private static char[][] gridToChar(List<String> grid) {
        char[][] temp = new char[grid.size()][grid.get(0).length()];

        for (int i = 0; i < grid.size(); i++) {
            temp[i] = grid.get(i).toCharArray();
        }

        return temp;
    }
}
