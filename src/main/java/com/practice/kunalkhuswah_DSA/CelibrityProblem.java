package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class CelibrityProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        sc.close();
        System.out.println(findCelebrity(M,N));
	}
	
	private static int findCelebrity(int M[][], int n) {
		// step 1: add every one to the stack
		
		Stack<Integer> possibleCelebs = new Stack<Integer>();
		
		for(int i = 0; i < n; i++)
			possibleCelebs.add(i);
		
		while(possibleCelebs.size() >= 2) {
			int p1 = possibleCelebs.pop();
			int p2 = possibleCelebs.pop();
			
			if(M[p1][p2] == 1) {
				// p1  knows p2 hence p2 can be a celeb p1 can't be
				possibleCelebs.push(p2);
			}else {
				// p1 don't know p2 hence p1 can be a celeb p2 can't be
				possibleCelebs.push(p1);
			}
		}
		//at last one person is in the stack left
		int celeb = possibleCelebs.pop();
		
		// check in row & column whether all the row elements are zero or not && column elements are 1or not
		
		for(int i = 0; i < n; i++) {
			if(i != celeb && M[celeb][i] != 0)
				return -1;
			if(i != celeb && M[i][celeb] != 1)
				return -1;
		}
		
		return celeb;
    }
}
