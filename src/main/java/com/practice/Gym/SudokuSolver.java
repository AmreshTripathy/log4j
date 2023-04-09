package com.practice.Gym;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=0578d9dd-39f8-4524-87dd-8aab109b2f37
 * https://leetcode.com/problems/sudoku-solver/
 * https://www.youtube.com/watch?v=FWAIf_EVUKE
 */

import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        sc.close();
        solveSudoku(board);

        if (isValidSudoku(board))
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid_2(board, i, j, board[i][j]))
                    return false;
            }
        }

        return true;
    }

    private static boolean isValid_2(char[][] board, int row, int col, char c) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c && i != col)
                return false;

            if (board[i][col] == c && i != row)
                return false;

            int temp_r = 3 * (row / 3) + i / 3;
            int temp_c = 3 * (col / 3) + i % 3;
            if (board[temp_r][temp_c] == c && temp_r != row && temp_c != col)
                return false;
        }

        return true;
    }

    public static void solveSudoku(char[][] board) {
        solve(board);

        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char i = '0'; i < '9'; i++) {
                        // checking 3 test cases
                        // 1 - row, 2 - col, 3 - is present in 3 x 3 matrix
                        if (isValid(board, row, col, i)) {
                            board[row][col] = i;

                            if (solve(board) == true)
                                return true;
                            else
                                board[row][col] = '.';
                        }
                    }
                    // return false if noting is applicable or suited number for blank space
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c)
                return false;

            if (board[i][col] == c)
                return false;

            // !important formula
            // row / 3 define which group horizontaly and col / 3 for vertical
            // multiplying 3 because we need it for 3 x 3 matrix
            // i / 3 defines row index and i % 3 represents column index
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }

        return true;
    }
}
