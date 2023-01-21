package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=yf3oUhkvqA0
 * https://course.acciojob.com/idle?question=b21cba45-2a97-4492-82f7-5e23ed20ac00
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// here we have used BFS (Breadth First Search) algorithm
public class RottingOranges {
    static class Pair {
        int row, column, time;
        Pair(int row, int column, int time) {
            this.row = row;
            this.column = column;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        sc.close();

        System.out.println(orangesRotting(grid));
    }

    private static int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int countFresh = 0;

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0)); // adding those are rotten
                    vis[i][j] = 2;
                }else if(grid[i][j] == 1) {
                    countFresh++; // counting the fresh count
                }else {
                    vis[i][j] = 0;
                }
            }

        int ans = 0;
        // adding 4postion to go 4 direction from one point (left, right, top, bottom)
        int[] deltaRow = {0, 0, -1, 1};
        int[] deltaCol = {-1, 1, 0, 0};
        int countFeshOranges = 0;
        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().column;
            int t = q.peek().time;
            q.remove();
            ans = Math.max(ans, t);
            for(int i = 0; i < 4; i++) {
                int nRow = r + deltaRow[i];
                int nCol = c + deltaCol[i];
                
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && vis[nRow][nCol] != 2 && grid[nRow][nCol] == 1) {
                    q.add(new Pair(nRow, nCol, t + 1));
                    vis[nRow][nCol] = 2;
                    countFeshOranges++;
                }
            }
        }
        if(countFeshOranges != countFresh) return -1;
        return ans;
    }
}
